package griffith;

public class RightAngledTriangle extends Shape {
    private double a;
    private double b;
    private double c;

    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.a = base;
        this.b = height;
        this.c = hypotenuse;
    }

    public double getBase() {
        return a;
    }

    public void setBase(double base) {
        this.a = base;
    }

    public double getHeight() {
        return b;
    }

    public void setHeight(double height) {
        this.b = height;
    }

    public double getHypotenuse() {
        return c;
    }

    public void setHypotenuse(double hypotenuse) {
        this.c = hypotenuse;
    }
    
    @Override
    public double area() {
        return 0.5 * a * b;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Right Angled Triangle: " + getName() + ", Base: " + a + ", Height: " + b + ", Hypotenuse: " + c;
    }
}
