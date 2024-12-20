package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework.components.Employee;
import pro.sky.homework.exceptions.EmployeeIdNonUniqueException;
import pro.sky.homework.exceptions.EmployeeNotFoundException;
import pro.sky.homework.exceptions.EmployeeTooManyException;

import java.util.*;

@Service
@SessionScope
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeServiceImpl() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById(Integer id) {
        List<Employee> employees = getEmployeeByIdInner(id);
        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException();
        }
        if (employees.size() > 1) {
            throw new EmployeeTooManyException();
        }
        return employees.get(0);
    }

    public void addEmployee(Employee employee) {
        if (!getEmployeeByIdInner(employee.getId()).isEmpty()) {
            throw new EmployeeIdNonUniqueException();
        }
        employeeList.add(employee);
    }

    public void delEmployee(Integer employeeId) {
        employeeList.removeAll(getEmployeeByIdInner(employeeId));
    }

    private List<Employee> getEmployeeByIdInner(Integer id) {
        return employeeList
                .stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .toList();
    }
}
