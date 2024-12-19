package pro.sky.homework.exceptions;

public class EmployeesSalaryNonPositiveException extends IllegalArgumentException {
    public String getMessage() {
        return "Employee's salary can't be non-positive";
    }
}
