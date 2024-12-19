package pro.sky.homework.exceptions;

public class DepartmentTooManyException extends RuntimeException {
    public String getMessage() {
        return "Too many values of department";
    }
}
