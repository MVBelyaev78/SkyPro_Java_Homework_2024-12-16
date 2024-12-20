package pro.sky.homework.components;

import org.springframework.stereotype.Component;
import pro.sky.homework.exceptions.DepartmentsNameEmptyException;

import java.util.Objects;

@Component
public class DepartmentImpl implements Department {
    private static Integer sequenceId = 1;

    private Integer id;
    private String name;

    private DepartmentImpl() {
    }

    public static Department valueOf(String name) {
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

    public boolean equals(Object object) {
        return (this == object ||
                object != null &&
                getClass() == object.getClass() &&
                Objects.equals(this.name, ((Department) object).getName()));
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
