package pro.sky.homework.exceptions;

public class EmployeeNotFoundException extends  RuntimeException {
    public String getMessage() {
        return "Employee is not found";
    }
}
