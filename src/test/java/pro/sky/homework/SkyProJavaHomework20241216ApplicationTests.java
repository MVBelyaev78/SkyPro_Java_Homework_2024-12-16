package pro.sky.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homework.components.Employee;
import pro.sky.homework.components.EmployeeImpl;
import pro.sky.homework.exceptions.EmployeeNotFoundException;
import pro.sky.homework.services.EmployeeService;
import pro.sky.homework.services.EmployeeServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkyProJavaHomework20241216ApplicationTests {

    @Test
    void checkSearchEmployeeById() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee emp1 = EmployeeImpl.valueOf(1, "John Lennon", 2716.84d);
        employeeService.getEmployeeList().add(emp1);
        employeeService
                .getEmployeeList()
                .add(EmployeeImpl.valueOf(1, "George Harrison", 1889.06d));
        assertEquals(emp1, employeeService.getEmployeeById(1));
        assertNotEquals(emp1, employeeService.getEmployeeById(2));
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.getEmployeeById(-1));
    }

//    @Test
//    void checkSearchEmployeesByDepartmentId() {
//        List<Employee> elExpected =
//                List.of(EmployeeImpl.valueOf(1, "John Lennon", 2716.84d),
//                        EmployeeImpl.valueOf(1, "George Harrison", 1889.06d),
//                        EmployeeImpl.valueOf(1, "Paul McCartney", 2361.43d),
//                        EmployeeImpl.valueOf(1, "Ringo Starr", 2676.42d));
//        assertIterableEquals(elExpected,
//                departmentService.getEmployeesByDepartmentId(1));
//        assertNotEquals(elExpected, departmentService.getEmployeesByDepartmentId(2));
//        assertTrue(departmentService.getEmployeesByDepartmentId(-1).isEmpty());
//    }
}
