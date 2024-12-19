package pro.sky.homework.exceptions;

public class EmployeesDepartmentIdEmptyException extends IllegalArgumentException {
    public String getMessage() {
        return "Employee's department ID can't be empty";
    }
}
