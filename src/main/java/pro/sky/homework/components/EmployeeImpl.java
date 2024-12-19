package pro.sky.homework.components;

import org.springframework.stereotype.Component;
import pro.sky.homework.exceptions.EmployeesDepartmentIdEmptyException;
import pro.sky.homework.exceptions.EmployeesNameEmptyException;
import pro.sky.homework.exceptions.EmployeesSalaryEmptyException;
import pro.sky.homework.exceptions.EmployeesSalaryNonPositiveException;

@Component
public class EmployeeImpl implements Employee {
    private static Integer sequenceId = 1;

    private Integer id;
    private Integer departmentId;
    private String fullName;
    private Double salary;

    private EmployeeImpl() {
    }

    public static EmployeeImpl valueOf(Integer departmentId, String fullName, Double salary) {
        if (departmentId == null) {
            throw new EmployeesDepartmentIdEmptyException();
        }
        if (fullName.isEmpty()) {
            throw new EmployeesNameEmptyException();
        }
        if (salary == null) {
            throw new EmployeesSalaryEmptyException();
        }
        if (salary <= 0) {
            throw new EmployeesSalaryNonPositiveException();
        }
        EmployeeImpl result = new EmployeeImpl();
        result.id = sequenceId++;
        result.departmentId = departmentId;
        result.fullName = fullName;
        result.salary = salary;
        return result;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getFullName() {
        return fullName;
    }

    public Double getSalary() {
        return salary;
    }
}
