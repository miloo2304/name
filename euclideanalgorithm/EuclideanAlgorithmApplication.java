package euclideanalgorithm;

public class EuclideanAlgorithmApplication {

    public static void main(String[] args) {
        Alghorithm user = new Alghorithm(121,256);

        System.out.println(user.iterative());
        System.out.println(user.recursive(121, 256));
    }
}
