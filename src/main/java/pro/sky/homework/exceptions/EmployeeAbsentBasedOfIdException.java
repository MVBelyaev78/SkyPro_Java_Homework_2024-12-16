package pro.sky.homework.exceptions;

public class EmployeeAbsentBasedOfIdException extends RuntimeException {
    public String getMessage() {
        return "Employee with this id is absent in data";
    }
}
