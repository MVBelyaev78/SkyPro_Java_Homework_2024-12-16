package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Department;
import pro.sky.homework.components.Employee;
import pro.sky.homework.exceptions.DepartmentNotFoundException;
import pro.sky.homework.exceptions.DepartmentTooManyException;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private List<Department> departmentList;
    private EmployeeService employeeService;

    private DepartmentServiceImpl() {
    }

    public DepartmentServiceImpl(List<Department> departmentList, EmployeeService employeeService) {
        this.departmentList = departmentList;
        this.employeeService = employeeService;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public Department getDepartmentById(Integer id) {
        List<Department> departments = departmentList
                .stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .toList();
        if (departments.isEmpty()) {
            throw new DepartmentNotFoundException();
        }
        if (departments.size() > 1) {
            throw new DepartmentTooManyException();
        }
        return departments.get(0);
    }

    public List<Employee> getEmployeesByDepartmentId(Integer departmentId) {
        return employeeService
                .getEmployeeList()
                .stream()
                .filter(e -> Objects.equals(e.getDepartmentId(), departmentId))
                .toList();
    }

    public Double getSumSalaryByDepartmentId(Integer departmentId) {
        return employeeService
                .getEmployeeList()
                .stream()
                .filter(e -> Objects.equals(e.getDepartmentId(), departmentId))
                .mapToDouble(Employee::getSalary)
                .sum();

    }

    public OptionalDouble getMinSalaryByDepartmentId(Integer departmentId) {
        return employeeService
                .getEmployeeList()
                .stream()
                .filter(e -> Objects.equals(e.getDepartmentId(), departmentId))
                .mapToDouble(Employee::getSalary)
                .min();
    }

    public OptionalDouble getMaxSalaryByDepartmentId(Integer departmentId) {
        return employeeService
                .getEmployeeList()
                .stream()
                .filter(e -> Objects.equals(e.getDepartmentId(), departmentId))
                .mapToDouble(Employee::getSalary)
                .max();
    }

    public Map<Integer, List<Employee>> getMapEmployeesForDepartments() {
        return employeeService
                .getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentId));
    }
}
