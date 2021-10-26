package ru.gaidamaka.jvm.lang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import ru.gaidamaka.jvm.lang.antlr4.boklLexer;
import ru.gaidamaka.jvm.lang.antlr4.boklParser;

import java.io.IOException;

public final class BoklClassFactory {
    private BoklClassFactory(){}

    static ClassWriter createClass(String inputFile, String className) throws IOException {
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        classWriter.visit(
                52,
                Opcodes.ACC_PUBLIC +Opcodes.ACC_SUPER,
                className,
                null,
                "java/lang/Object",
                null
        );

        MethodVisitor methodVisitor = classWriter.visitMethod(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null
        );


        CharStream charStream = CharStreams.fromFileName(inputFile);

        boklLexer lexer = new boklLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        boklParser parser = new boklParser(tokenStream);
        BoklListener boklListener = new BoklListener(methodVisitor);
        parser.addParseListener(boklListener);
        parser.script();
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(255, 255);
        methodVisitor.visitEnd();
        classWriter.visitEnd();
        return classWriter;
    }
}
