package ru.enovia.training.Service.Exception;

public abstract class BaseException extends RuntimeException {

    public BaseException(String message) {
        super(message);
    }

}
