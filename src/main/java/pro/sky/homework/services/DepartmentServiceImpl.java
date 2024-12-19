package pro.sky.homework.services;

import org.springframework.stereotype.Service;
import pro.sky.homework.components.Department;
import pro.sky.homework.exceptions.DepartmentNotFoundException;
import pro.sky.homework.exceptions.DepartmentTooManyException;
import pro.sky.homework.repositories.StaffRepository;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final List<Department> departmentList = StaffRepository.getDepartments();

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public Department getDepartmentById(Integer id) {
        List<Department> departments = departmentList
                .stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .toList();
        if (departments.isEmpty()) {
            throw new DepartmentNotFoundException();
        }
        if (departments.size() > 1) {
            throw new DepartmentTooManyException();
        }
        return departments.get(0);
    }
}
