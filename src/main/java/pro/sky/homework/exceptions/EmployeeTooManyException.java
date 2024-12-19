package pro.sky.homework.exceptions;

public class EmployeeTooManyException extends RuntimeException{
    public String getMessage() {
        return "Too many values of employee";
    }
}
