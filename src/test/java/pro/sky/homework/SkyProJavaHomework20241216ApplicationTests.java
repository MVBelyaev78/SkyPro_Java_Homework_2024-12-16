package pro.sky.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homework.repositories.StaffRepository;
import pro.sky.homework.services.DepartmentService;
import pro.sky.homework.services.DepartmentServiceImpl;
import pro.sky.homework.services.EmployeeService;
import pro.sky.homework.services.EmployeeServiceImpl;

@SpringBootTest
class SkyProJavaHomework20241216ApplicationTests {
    EmployeeService employeeService = new EmployeeServiceImpl(StaffRepository.getEmployees());
    DepartmentService departmentService = new DepartmentServiceImpl(StaffRepository.getDepartments());

    @Test
    void contextLoads() {
    }

}
