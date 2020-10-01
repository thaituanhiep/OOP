package equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        } else return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        } else return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }
}
