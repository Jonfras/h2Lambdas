package net.htlgkr.krejo.Lamdas;

public class Number {
    private double a;
    private double b;

    public Number(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Solution:{" + a + "/"+ b + "}";
    }
}
