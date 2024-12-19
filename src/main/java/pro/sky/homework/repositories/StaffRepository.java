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
        employeeList.add(EmployeeImpl.valueOf(1, "John Lennon", 1000d));
        employeeList.add(EmployeeImpl.valueOf(1, "George Harrison", 1000d));
        employeeList.add(EmployeeImpl.valueOf(1, "Paul McCartney", 1000d));
        employeeList.add(EmployeeImpl.valueOf(1, "Ringo Starr", 1000d));
        employeeList.add(EmployeeImpl.valueOf(2, "Michael Serrano", 1000d));
        employeeList.add(EmployeeImpl.valueOf(2, "Olaf Flow", 1000d));
        employeeList.add(EmployeeImpl.valueOf(2, "Samuel Flinn", 1000d));
        employeeList.add(EmployeeImpl.valueOf(2, "Leo Brooks", 1000d));
        employeeList.add(EmployeeImpl.valueOf(3, "Martin Lee", 1000d));
        employeeList.add(EmployeeImpl.valueOf(3, "Lee Sheriden", 1000d));
        employeeList.add(EmployeeImpl.valueOf(3, "Nicky Stevens", 1000d));
        employeeList.add(EmployeeImpl.valueOf(3, "Sandra Stevens", 1000d));
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
