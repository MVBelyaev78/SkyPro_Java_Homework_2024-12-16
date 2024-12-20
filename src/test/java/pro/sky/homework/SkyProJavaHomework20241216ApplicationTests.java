package pro.sky.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homework.components.EmployeeImpl;
import pro.sky.homework.exceptions.EmployeeNotFoundException;
import pro.sky.homework.repositories.StaffRepository;
import pro.sky.homework.services.EmployeeService;
import pro.sky.homework.services.EmployeeServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkyProJavaHomework20241216ApplicationTests {
    EmployeeService employeeService = new EmployeeServiceImpl(StaffRepository.getEmployees());

    @Test
    void checkSearchEmployeeById() {
        assertEquals(EmployeeImpl.valueOf(1, "John Lennon", 2716.84d),
                employeeService.getEmployeeById(1));
        assertNotEquals(EmployeeImpl.valueOf(1, "John Lennon", 2716.84d),
                employeeService.getEmployeeById(2));
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
