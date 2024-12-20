package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Employee;
import pro.sky.homework.exceptions.EmployeeNotFoundException;
import pro.sky.homework.exceptions.EmployeeTooManyException;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    private EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

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
