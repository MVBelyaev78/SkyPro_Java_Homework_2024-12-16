package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getEmployeeList();
}
