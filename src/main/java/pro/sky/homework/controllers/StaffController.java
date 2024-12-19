package pro.sky.homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework.components.Department;
import pro.sky.homework.components.Employee;
import pro.sky.homework.services.DepartmentService;
import pro.sky.homework.services.EmployeeService;

@RestController
@RequestMapping("")
public class StaffController {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    public StaffController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(value = "/departments/{id}")
    public Department getDepartmentById(@PathVariable Integer id) {
        return departmentService.getDepartmentById(id);
    }
}
