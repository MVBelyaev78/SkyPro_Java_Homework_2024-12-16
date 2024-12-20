package pro.sky.homework.repositories;

import org.springframework.stereotype.Repository;
import pro.sky.homework.components.Department;
import pro.sky.homework.components.DepartmentImpl;
import pro.sky.homework.components.Employee;
import pro.sky.homework.components.EmployeeImpl;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffRepository {
    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(EmployeeImpl.valueOf(1, "John Lennon", 2716.84d));
        employeeList.add(EmployeeImpl.valueOf(1, "George Harrison", 1889.06d));
        employeeList.add(EmployeeImpl.valueOf(1, "Paul McCartney", 2361.43d));
        employeeList.add(EmployeeImpl.valueOf(1, "Ringo Starr", 2676.42d));
        employeeList.add(EmployeeImpl.valueOf(2, "Michael Serrano", 1783.46d));
        employeeList.add(EmployeeImpl.valueOf(2, "Olaf Flow", 1639.59d));
        employeeList.add(EmployeeImpl.valueOf(2, "Samuel Flinn", 2989.53d));
        employeeList.add(EmployeeImpl.valueOf(2, "Leo Brooks", 1584.12d));
        employeeList.add(EmployeeImpl.valueOf(3, "Martin Lee", 2616.83d));
        employeeList.add(EmployeeImpl.valueOf(3, "Lee Sheriden", 2586.10d));
        employeeList.add(EmployeeImpl.valueOf(3, "Nicky Stevens", 1693.89d));
        employeeList.add(EmployeeImpl.valueOf(3, "Sandra Stevens", 2061.98d));
        return employeeList;
    }

    public static List<Department> getDepartments() {
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(DepartmentImpl.valueOf("sales"));
        departmentList.add(DepartmentImpl.valueOf("account"));
        departmentList.add(DepartmentImpl.valueOf("HR"));
        return departmentList;
    }
}
