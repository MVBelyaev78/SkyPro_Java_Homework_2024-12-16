package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework.components.Employee;
import pro.sky.homework.exceptions.*;

import java.util.*;

@Service
@SessionScope
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeServiceImpl() {
    }

    public List<Employee> getEmployeeList() {
        return List.copyOf(employeeList);
    }

    public void add(Employee employee) {
        if (!getEmployeeByIdInner(employee.getId()).isEmpty()) {
            throw new EmployeeIdNonUniqueException();
        }
        if (!getEmployeeByDataInner(employee).isEmpty()) {
            throw new EmployeeDataNonUniqueException();
        }
        employeeList.add(employee);
    }

    public void del(Integer employeeId) {
        if (getEmployeeByIdInner(employeeId).isEmpty()) {
            throw new EmployeeAbsentBasedOfIdException();
        }
        employeeList.removeAll(getEmployeeByIdInner(employeeId));
    }

    private List<Employee> getEmployeeByIdInner(Integer id) {
        return employeeList
                .stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .toList();
    }

    private List<Employee> getEmployeeByDataInner(Employee employee) {
        return employeeList
                .stream()
                .filter(e -> Objects.equals(e, employee))
                .toList();
    }
}
