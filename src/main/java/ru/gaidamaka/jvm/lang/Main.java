package ru.gaidamaka.jvm.lang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.gaidamaka.jvm.lang.antlr4.boklLexer;
import ru.gaidamaka.jvm.lang.antlr4.boklParser;
import ru.gaidamaka.jvm.lang.exception.MissDeclarationException;
import ru.gaidamaka.jvm.lang.exception.MultiplyVariableDeclarationException;
import ru.gaidamaka.jvm.lang.utils.StringUtils;

import java.io.*;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        if (args.length != 1){
            log.error("Неверное количество аргументов={}, должен быть один аргумент", args.length);
            System.out.println("Неверное количество аргументов");
            return;
        }
        try {
            String fileNameWithoutExt = StringUtils.fileNameWithoutExt(args[0]);
            ClassWriter classWriter = BoklClassFactory.createClass(args[0], fileNameWithoutExt);
            File classFile = new File(fileNameWithoutExt + ".class");
            try (BufferedOutputStream w = new BufferedOutputStream(new FileOutputStream(classFile))) {
                byte[] byteArray = classWriter.toByteArray();
                w.write(byteArray, 0, byteArray.length);
                w.flush();
            }
        }
        catch (IOException e){
            log.error("Ошибка отрытия файла: {}", args[0], e);
        } catch (MissDeclarationException | MultiplyVariableDeclarationException e){
            log.error("Ошибка при объявлении переменных", e);
        } catch (Exception e){
            log.error("Неизвестная ошибка", e);
        }
    }

}
