package ru.gaidamaka.jvm.lang.exception;

public class MultiplyVariableDeclarationException extends RuntimeException{
    public MultiplyVariableDeclarationException() {
        super();
    }

    public MultiplyVariableDeclarationException(String message) {
        super(message);
    }

    public MultiplyVariableDeclarationException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultiplyVariableDeclarationException(Throwable cause) {
        super(cause);
    }
}
