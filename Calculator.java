import java.lang.*;
import java.io.*;
import java.util.*;

class Numbers {

    private int a;
    private int b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA(int a) {
        return a;
    }

    public int getB(int b) {
        return b;
    }
    @Override
    public int hashCode() {
        return a + b;
    }

    public boolean equals(int a, int b) {
        return (a == this.a && b == this.b);
        }
    }

class Numb {
    public void substraction(int a, int b) {
        int c = a - b;
        System.out.println("Result: " + c);
    }
    public void sum(int a, int b) {
        int d = a + b;
        System.out.println("Result: " + d);
    }
}

public class Calculator {
public static void main(String[] args) {
    Numb user = new Numb();
    user.substraction(1, 3);
    user.sum(1, 3);
    }
}