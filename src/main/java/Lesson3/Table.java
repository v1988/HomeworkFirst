package Lesson3;

import java.util.Objects;

public class Table {
    int price;
    String Colour;
    int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return price == table.price &&
                year == table.year &&
                Objects.equals(Colour, table.Colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, Colour, year);
    }
}
