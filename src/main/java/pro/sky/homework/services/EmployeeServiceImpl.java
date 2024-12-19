package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Employee;
import pro.sky.homework.exceptions.EmployeeNotFoundException;
import pro.sky.homework.exceptions.EmployeeTooManyException;
import pro.sky.homework.repositories.StaffRepository;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList = StaffRepository.getEmployees();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById(Integer id) {
        List<Employee> employees = employeeList
                .stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .toList();
        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException();
        }
        if (employees.size() > 1) {
            throw new EmployeeTooManyException();
        }
        return employees.get(0);
    }
}
