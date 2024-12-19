package pro.sky.homework.components;

import org.springframework.stereotype.Component;
import pro.sky.homework.exceptions.DepartmentsNameEmptyException;

@Component
public class DepartmentImpl implements Department {
    private static Integer sequenceId = 1;

    private Integer id;
    private String name;

    private DepartmentImpl() {
    }

    public static DepartmentImpl valueOf(String name) {
        if (name.isEmpty()) {
            throw new DepartmentsNameEmptyException();
        }
        DepartmentImpl result = new DepartmentImpl();
        result.id = sequenceId++;
        result.name = name;
        return result;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
