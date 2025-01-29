package euclideanalgorithm;


public class Alghorithm {
    private int a;
    private int b;

    public Alghorithm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Alghorithm() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int iterative() {
        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
            System.out.println(x + " " + y );
        }
        return x;
    }

    public static int recursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return recursive(b, a % b);
    }
}