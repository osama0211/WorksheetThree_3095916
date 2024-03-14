package griffith;

public class Rhombus extends Shape {
    private double side;
    private double diagonal1;
    private double diagonal2;

    public Rhombus(String name, double side, double diagonal1, double diagonal2) {
        super(name);
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Rhombus: " + getName() + ", Side: " + side + " Area: " + area() + " Perimeter: " + perimeter();
    }
}
