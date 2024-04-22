package day10.exception;

public class InvaildLoginInputException extends Exception{

    public InvaildLoginInputException() {
    }
    public InvaildLoginInputException(String message) {
    super(message);
    }
}
