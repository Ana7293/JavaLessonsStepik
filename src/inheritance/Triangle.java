package inheritance;

public class Triangle extends Shape {

    double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return getA()+ getB() + c;
    }
}
