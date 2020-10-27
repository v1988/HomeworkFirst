package Lesson7;

public class Variables {
    byte b;
    short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private boolean boo;
    private String str;


    public void setByte(byte b1) {
        this.b = b1;
    }

    public void setShort(short s1) {
        this.s = s1;
    }

    public void setInt(int i1) {
        this.i = i1;
    }

    public void setLong(long l1) {
        this.l = l1;
    }

    public void setFloat(float f1) {
        this.f = f1;
    }

    public void setDouble(double d1) {
        this.d = d1;
    }

    public void setChar(char c1) {
        this.c = c1;
    }

    public void setBoolean(boolean boo1) {
        this.boo = boo1;
    }

    public void setString(String str1) {
        this.str = str1;
    }


    public byte getByte() {
        return b;
    }

    public short getShort() {
        return s;
    }

    public int getInt() {
        return i;
    }

    public long getLong() {
        return l;
    }

    public float getFloat() {
        return f;
    }

    public double getDouble() {
        return d;
    }

    public char getChar() {
        return c;
    }

    public boolean getBoolean() {
        return boo;
    }

    public String getString() {
        return str;
    }



    public Variables(byte b) {
        this.b = b;
    }


    public Variables(byte b, short s) {
        this.b = b;
        this.s = s;
    }

        public Variables(byte b, short s, int i) {
        this.b = b;
        this.s = s;
        this.i = i;
    }

        public Variables(byte b, short s, int i, long l) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
    }

        public Variables(byte b, short s, int i, long l, float f) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
    }

        public Variables(byte b, short s, int i, long l, float f, double d) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

        public Variables(byte b, short s, int i, long l, float f, double d, char c) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
    }

        public Variables(byte b, short s, int i, long l, float f, double d, char c, boolean boo) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
        this.boo = boo;
    }

        public Variables(byte b, short s, int i, long l, float f, double d, char c, boolean boo, String str) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
        this.boo = boo;
        this.str = str;
    }
}


