package Lesson7;

public class Final {
    final int i1 ;
    final int i2 ;
    final int i3 ;

    public Final(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    // Низя менять final
    // public void setInt1(int int1) { this.i1 = int1; }
    // public void setInt2(int int2) { this.i2 = int2; }
    // public void setInt3(int int3) { this.i3 = int3; }

    public int getInt1() {
        return i1;
    }
    public int getInt2() {
        return i2;
    }
    public int getInt3() {
        return i3;
    }
}
