package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Department;
import pro.sky.homework.repositories.StaffRepository;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final List<Department> departmentList = StaffRepository.getDepartments();

    public List<Department> getDepartmentList() {
        return departmentList;
    }
}
