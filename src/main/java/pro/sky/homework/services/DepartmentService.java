package pro.sky.homework.services;

import pro.sky.homework.components.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartmentList();
    Department getDepartmentById(Integer id);
}
