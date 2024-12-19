package pro.sky.homework.exceptions;

public class EmployeesNameEmptyException extends IllegalArgumentException {
    public String getMessage() {
        return "Employee's full name can't be empty";
    }
}
