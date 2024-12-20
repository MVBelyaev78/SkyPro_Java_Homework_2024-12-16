package pro.sky.homework.exceptions;

public class EmployeeDataNonUniqueException extends RuntimeException {
    public String getMessage() {
        return "Employee data must be unique";
    }
}
