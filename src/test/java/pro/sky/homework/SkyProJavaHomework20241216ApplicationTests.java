package pro.sky.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.homework.components.Employee;
import pro.sky.homework.components.EmployeeImpl;
import pro.sky.homework.exceptions.EmployeeAbsentBasedOfIdException;
import pro.sky.homework.exceptions.EmployeeDataNonUniqueException;
import pro.sky.homework.exceptions.EmployeeIdNonUniqueException;
import pro.sky.homework.services.EmployeeService;
import pro.sky.homework.services.EmployeeServiceImpl;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SkyProJavaHomework20241216ApplicationTests {
    @Test
    void checkAddEmployee() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee emp1 = EmployeeImpl.valueOf(1, "John Lennon", 2716.84d);
        assertTrue(auxCheckEmployeeDataEmpty(employeeService, emp1.getId()));
        assertDoesNotThrow(() -> employeeService.add(emp1));
        assertFalse(auxCheckEmployeeDataEmpty(employeeService, emp1.getId()));
        assertThrows(EmployeeIdNonUniqueException.class, () -> employeeService.add(emp1));
        // Data in emp2 must be the same as in emp1
        Employee emp2 = EmployeeImpl.valueOf(1, "John Lennon", 2716.84d);
        assertThrows(EmployeeDataNonUniqueException.class, () -> employeeService.add(emp2));
    }

    @Test
    void checkDelEmployee() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee emp1 = EmployeeImpl.valueOf(1, "John Lennon", 2716.84d);
        employeeService.add(emp1);
        assertFalse(auxCheckEmployeeDataEmpty(employeeService, emp1.getId()));
        assertDoesNotThrow(() -> employeeService.del(emp1.getId()));
        assertTrue(auxCheckEmployeeDataEmpty(employeeService, emp1.getId()));
        assertThrows(EmployeeAbsentBasedOfIdException.class, () -> employeeService.del(emp1.getId()));
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

    private boolean auxCheckEmployeeDataEmpty(EmployeeService employeeService, Integer employeeId) {
        return employeeService
                .getEmployeeList()
                .stream()
                .filter(e -> Objects.equals(e.getId(), employeeId))
                .toList()
                .isEmpty();
    }
}
