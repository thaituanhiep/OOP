package equation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3, 5, 2);
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println(quadraticEquation.getRoot1() + "   " + quadraticEquation.getRoot2());
        } else System.out.println("The equation has no roots");
    }
}
