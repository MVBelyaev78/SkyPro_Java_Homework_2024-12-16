package pro.sky.homework.exceptions;

public class DepartmentsNameEmptyException extends IllegalArgumentException {
    public String getMessage() {
        return "Department's name can't be empty";
    }
}
