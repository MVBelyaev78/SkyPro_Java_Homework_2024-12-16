package pro.sky.homework.components;

public interface Employee {
    Integer getId();

    Integer getDepartmentId();

    String getFullName();

    Double getSalary();

    boolean equals(Object object);

    int hashCode();
}
