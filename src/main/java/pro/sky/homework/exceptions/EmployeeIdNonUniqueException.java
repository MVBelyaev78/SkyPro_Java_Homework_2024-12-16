package pro.sky.homework.exceptions;

public class EmployeeIdNonUniqueException extends RuntimeException {
    public String getMessage() {
        return "Employee ID must be unique";
    }
}
