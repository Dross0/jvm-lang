package ru.gaidamaka.jvm.lang;


import java.util.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import ru.gaidamaka.jvm.lang.antlr4.boklBaseListener;
import ru.gaidamaka.jvm.lang.antlr4.boklParser;

public class BoklListener extends boklBaseListener {

    private final MethodVisitor methodVisitor;
    private final VariableStorage variableStorage = new VariableStorage();
    private final Map<String, Label> labels = new HashMap<>();
    private final LinkedList<Label> flows = new LinkedList<>();

    public BoklListener(MethodVisitor methodVisitor){
        this.methodVisitor = methodVisitor;
    }

    @Override
    public void exitVarDeclaration(boklParser.VarDeclarationContext ctx) {
        String varName = ctx.Var().getSymbol().getText();
        VarType type = ctx.type().Int() == null ? VarType.STRING : VarType.INT;
        variableStorage.declare(varName, type);
    }

    @Override
    public void exitIntVarDeclaration(boklParser.IntVarDeclarationContext ctx) {
        String varName = ctx.Var().getSymbol().getText();
        int id = variableStorage.declare(varName, VarType.INT);
        assignInt(id, ctx.intRValue());
    }

    @Override
    public void exitIntVarAssign(boklParser.IntVarAssignContext ctx) {
        String varName = ctx.Var().getText();
        int id = variableStorage.getId(varName);
        assignInt(id, ctx.intRValue());
    }

    private void assignInt(int id, boklParser.IntRValueContext intRValueContext) {
        if (intRValueContext.Num() != null){
            int val = Integer.parseInt(intRValueContext.Num().getText());
            methodVisitor.visitLdcInsn(val);
            methodVisitor.visitVarInsn(Opcodes.ISTORE, id);
        }
        else{
            String varName = intRValueContext.Var().getText();
            int rId = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ILOAD, rId);
            methodVisitor.visitIntInsn(Opcodes.ISTORE, id);
        }
    }

    @Override
    public void exitStrVarDeclaration(boklParser.StrVarDeclarationContext ctx) {
        String varName = ctx.Var().getSymbol().getText();
        int id = variableStorage.declare(varName, VarType.STRING);
        assignStr(id, ctx.strRValue());
    }

    @Override
    public void exitStrVarAssign(boklParser.StrVarAssignContext ctx) {
        String varName = ctx.Var().getText();
        int id = variableStorage.getId(varName);
        assignStr(id, ctx.strRValue());
    }

    private void assignStr(int id, boklParser.StrRValueContext strRValueContext) {
        if (strRValueContext.StringValue() != null) {
            String text = removeDoubleQuotes(strRValueContext.StringValue().getText());
            methodVisitor.visitLdcInsn(text);
            methodVisitor.visitVarInsn(Opcodes.ASTORE, id);
        }
        else{
            String varName = strRValueContext.Var().getText();
            int rId = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, rId);
            methodVisitor.visitIntInsn(Opcodes.ASTORE, id);
        }
    }

    @Override
    public void exitPrint(boklParser.PrintContext ctx) {
        methodVisitor.visitFieldInsn(
                Opcodes.GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;");

        String desc;
        if (ctx.Num() != null){
            methodVisitor.visitLdcInsn(Integer.parseInt(ctx.Num().getText()));
            desc = "(I)V";
        }
        else if (ctx.StringValue() != null){
            methodVisitor.visitLdcInsn(removeDoubleQuotes(ctx.StringValue().getText()));
            desc = "(Ljava/lang/String;)V";
        }
        else{
            String varName = ctx.Var().getText();
            int id = variableStorage.getId(varName);

            if (variableStorage.isType(varName, VarType.INT)){
                methodVisitor.visitVarInsn(Opcodes.ILOAD, id);
                desc = "(I)V";
            }
            else{
                methodVisitor.visitVarInsn(Opcodes.ALOAD, id);
                desc = "(Ljava/lang/String;)V";
            }
        }
        methodVisitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                desc,
                false
        );
    }

    @Override
    public void exitGotoLabel(boklParser.GotoLabelContext ctx) {
        String labelName = ctx.Var().getText();
        labels.putIfAbsent(labelName, new Label());
        methodVisitor.visitLabel(labels.get(labelName));
    }

    @Override
    public void exitGotoOperation(boklParser.GotoOperationContext ctx) {
        String labelName = ctx.Var().getText();
        if (!labels.containsKey(labelName)){
            throw new IllegalArgumentException();
        }
        methodVisitor.visitJumpInsn(Opcodes.GOTO, labels.get(labelName));
    }

    @Override
    public void exitIfStatement(boklParser.IfStatementContext ctx) {
        Label l = flows.pollLast();
        methodVisitor.visitLabel(l);
    }


    @Override
    public void exitCompareInt(boklParser.CompareIntContext ctx) {
        if (ctx.intRValue(0).Var() != null){
            String varName = ctx.intRValue(0).Var().getText();

            int id = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ILOAD, id);
        }
        else{
            methodVisitor.visitLdcInsn(Integer.parseInt(ctx.intRValue(0).Num().getText()));
        }

        if (ctx.intRValue(1).Var() != null){
            String varName = ctx.intRValue(1).Var().getText();
            int id = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ILOAD, id);
        }
        else{
            methodVisitor.visitLdcInsn(Integer.parseInt(ctx.intRValue(1).Num().getText()));
        }

        Label l = new Label();

        switch (ctx.compareOperation().getText()){
            case "==":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, l);
                break;
            case "!=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPEQ, l);
                break;
            case "<":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGT, l);
                break;
            case "<=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, l);
                break;
            case ">":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLT, l);
                break;
            case ">=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLE, l);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation="+ctx.compareOperation().getText());
        }
        flows.add(l);
    }

    @Override
    public void exitCompareStr(boklParser.CompareStrContext ctx) {
        if (ctx.strRValue(0).Var() != null){
            String varName = ctx.strRValue(0).Var().getText();

            int id = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, id);
        }
        else{
            methodVisitor.visitLdcInsn(removeDoubleQuotes(ctx.strRValue(0).StringValue().getText()));
        }

        if (ctx.strRValue(1).Var() != null){
            String varName = ctx.strRValue(1).Var().getText();

            int id = variableStorage.getId(varName);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, id);
        }
        else{
            methodVisitor.visitLdcInsn(removeDoubleQuotes(ctx.strRValue(1).StringValue().getText()));
        }

        methodVisitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/lang/String",
                "compareTo",
                "(Ljava/lang/String;)I",
                false);

        Label l = new Label();
        methodVisitor.visitLdcInsn(0);

        switch (ctx.compareOperation().getText()){
            case "==":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPEQ, l);
                break;
            case "!=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, l);
                break;
            case "<":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLT, l);
                break;
            case "<=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPLE, l);
                break;
            case ">":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGT, l);
                break;
            case ">=":
                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, l);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation="+ctx.compareOperation().getText());
        }
        flows.add(l);
    }

    @Override
    public void enterWhileLoop(boklParser.WhileLoopContext ctx) {
        Label l = new Label();
        methodVisitor.visitLabel(l);
        flows.add(l);
    }

    @Override
    public void exitWhileLoop(boklParser.WhileLoopContext ctx) {
        Label l = flows.pollLast();
        methodVisitor.visitLabel(l);
    }

    @Override
    public void exitCodeBlock(boklParser.CodeBlockContext ctx) {
        if (ctx.parent instanceof boklParser.WhileLoopContext){
            Label ifLabel = flows.pollLast();
            Label loopLabel = flows.pollLast();
            methodVisitor.visitJumpInsn(Opcodes.GOTO, loopLabel);
            flows.add(ifLabel);
        }
    }

    @Override
    public void exitIncrement(boklParser.IncrementContext ctx) {
        String varName = ctx.Var().getText();
        int id = variableStorage.getId(varName);
        methodVisitor.visitIincInsn(id, 1);
    }

    public String removeDoubleQuotes(String request) {
        return request.replace("\"", "");
    }
}