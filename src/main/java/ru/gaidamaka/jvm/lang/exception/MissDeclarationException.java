package ru.gaidamaka.jvm.lang.exception;

public class MissDeclarationException extends RuntimeException{
    public MissDeclarationException() {
        super();
    }

    public MissDeclarationException(String message) {
        super(message);
    }

    public MissDeclarationException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissDeclarationException(Throwable cause) {
        super(cause);
    }
}
