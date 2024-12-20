package pro.sky.homework.exceptions;

public class EmployeeIdNonUniqueException extends IllegalArgumentException {
    public String getMessage() {
        return "Employee ID must be unique";
    }
}
