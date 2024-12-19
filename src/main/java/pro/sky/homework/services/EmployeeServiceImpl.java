package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Employee;
import pro.sky.homework.repositories.StaffRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList = StaffRepository.getEmployees();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
