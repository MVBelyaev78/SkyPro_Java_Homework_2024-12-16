package pro.sky.homework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class StaffController {
    private final EmployeeService employeeService;

    public StaffController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
