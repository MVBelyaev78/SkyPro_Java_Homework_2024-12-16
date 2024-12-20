package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Employee;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

@Service
public interface EmployeeService {
    List<Employee> getEmployeeList();

    Employee getEmployeeById(Integer id);
}
