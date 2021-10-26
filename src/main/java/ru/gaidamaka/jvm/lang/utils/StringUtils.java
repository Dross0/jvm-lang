package ru.gaidamaka.jvm.lang.utils;

public final class StringUtils {
    private StringUtils(){}

    public static String removeDoubleQuotes(String request) {
        return request.replace("\"", "");
    }

    public static String fileNameWithoutExt(String fileName){
        return fileName.split("\\.")[0];
    }

}
