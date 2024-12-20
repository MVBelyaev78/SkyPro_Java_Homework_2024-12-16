package pro.sky.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homework.components.Employee;
import pro.sky.homework.components.EmployeeImpl;
import pro.sky.homework.repositories.StaffRepository;
import pro.sky.homework.services.EmployeeService;
import pro.sky.homework.services.EmployeeServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkyProJavaHomework20241216ApplicationTests {
    EmployeeService employeeService = new EmployeeServiceImpl(StaffRepository.getEmployees());

    @Test
    void checkEqualityOfEmployees() {
        assertEquals(EmployeeImpl.valueOf(1, "John Lennon", 1000d),
                employeeService.getEmployeeById(1));
    }

}
