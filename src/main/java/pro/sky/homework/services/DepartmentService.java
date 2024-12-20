package pro.sky.homework.services;

import pro.sky.homework.components.Department;
import pro.sky.homework.components.Employee;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public interface DepartmentService {
    List<Department> getDepartmentList();

    EmployeeService getEmployeeService();

    Department getDepartmentById(Integer id);

    List<Employee> getEmployeesByDepartmentId(Integer id);

    Double getSumSalaryByDepartmentId(Integer id);

    OptionalDouble getMinSalaryByDepartmentId(Integer id);

    OptionalDouble getMaxSalaryByDepartmentId(Integer id);

    Map<Integer, List<Employee>> getMapEmployeesForDepartments();
}
