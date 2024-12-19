package pro.sky.homework.exceptions;

public class EmployeesSalaryEmptyException extends IllegalArgumentException {
    public String getMessage() {
        return "Employee's salary can't be empty";
    }
}
