package pro.sky.homework.repositories;

import org.springframework.stereotype.Repository;
import pro.sky.homework.components.Employee;
import pro.sky.homework.components.EmployeeImpl;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffRepository {
    public static List<Employee> getEmployees() {
        List<Employee> employeeComponents = new ArrayList<>();
        employeeComponents.add(EmployeeImpl.valueOf(1, "John", 1000d));
        return employeeComponents;
    }
}
