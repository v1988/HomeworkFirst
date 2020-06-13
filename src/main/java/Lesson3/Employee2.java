package Lesson3;

import java.util.Objects;

public class Employee2 {
    double salary = 25000;
    String position = "Junior";
    int age = 22;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Double.compare(employee2.salary, salary) == 0 &&
                age == employee2.age &&
                Objects.equals(position, employee2.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, position, age);
    }
}
