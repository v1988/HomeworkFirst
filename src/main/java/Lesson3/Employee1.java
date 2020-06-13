package Lesson3;

import java.util.Objects;

public class Employee1 {
    double salary = 35000;
    String position = "Senior";
    int age = 28;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Double.compare(employee1.salary, salary) == 0 &&
                age == employee1.age &&
                Objects.equals(position, employee1.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, position, age);
    }
}
