package pro.sky.homework.exceptions;

public class DepartmentNotFoundException extends RuntimeException {
    public String getMessage() {
        return "Department is not found";
    }
}
