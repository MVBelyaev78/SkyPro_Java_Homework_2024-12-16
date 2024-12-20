package pro.sky.homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework.components.Department;
import pro.sky.homework.components.Employee;
import pro.sky.homework.services.DepartmentService;
import pro.sky.homework.services.EmployeeService;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

@RestController
@RequestMapping("")
public class StaffController {
    private final DepartmentService departmentService;

    public StaffController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployeeList() {
        return departmentService.getEmployeeService().getEmployeeList();
    }

    @GetMapping(value = "/departments")
    public List<Department> getDepartmentList() {
        return departmentService.getDepartmentList();
    }

    @GetMapping(value = "/department/{id}")
    public Department getDepartmentById(@PathVariable Integer id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping(value = "/department/{id}/employees")
    public List<Employee> getEmployeesByDepartmentId(@PathVariable Integer id) {
        return departmentService.getEmployeesByDepartmentId(id);
    }

    @GetMapping(value = "/department/{id}/salary/sum")
    public Double getSumSalaryByDepartmentId(@PathVariable Integer id) {
        return departmentService.getSumSalaryByDepartmentId(id);
    }

    @GetMapping(value = "/department/{id}/salary/min")
    public OptionalDouble getMinSalaryByDepartmentId(@PathVariable Integer id) {
        return departmentService.getMinSalaryByDepartmentId(id);
    }

    @GetMapping(value = "/department/{id}/salary/max")
    public OptionalDouble getMaxSalaryByDepartmentId(@PathVariable Integer id) {
        return departmentService.getMaxSalaryByDepartmentId(id);
    }

    @GetMapping(value ="department/employees")
    public Map<Integer, List<Employee>> getMapEmployeesForDepartments() {
        return departmentService.getMapEmployeesForDepartments();
    }
}
