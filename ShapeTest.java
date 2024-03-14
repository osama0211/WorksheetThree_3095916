package griffith;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ShapeTest {

    private static final double EPSILON = 0.0001;

    @Test
    void testCircle() {
        Circle circle = new Circle("Circle", 2.7);
        assertEquals(Math.PI * 2.7 * 2.7, circle.area(), EPSILON);
        assertEquals(2 * Math.PI * 2.7, circle.perimeter(), EPSILON);
        assertEquals("Circle: Circle Radius:2.7", circle.toString());
    }

    @Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus", 2, 2, 8);
        assertEquals(8, rhombus.area(), EPSILON);
        assertEquals(8, rhombus.perimeter(), EPSILON);
        assertEquals("Rhombus: Rhombus, Side: 2.0 Area: 8.0 Perimeter: 8.0", rhombus.toString());
    }

    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 1, 2, 3);
        assertEquals(1, triangle.area(), EPSILON);
        assertEquals(6, triangle.perimeter(), EPSILON);
        assertEquals("Right Angled Triangle: Triangle, Base: 1.0, Height: 2.0, Hypotenuse: 3.0", triangle.toString());
    }
    @Test
    void testIntegration() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle", 2.7));
        shapes.add(new Circle("Circle", 3.8));
        shapes.add(new Rhombus("Rhombus", 2, 2, 8));
        shapes.add(new Rhombus("Rhombus", 1, 7, 6));
        shapes.add(new RightAngledTriangle("Triangle", 1, 2, 3));
        shapes.add(new RightAngledTriangle("Triangle", 4, 8, 9));

        for (Shape shape : shapes) {
            assertEquals(shape.area(), shape.area(), EPSILON);
            assertEquals(shape.perimeter(), shape.perimeter(), EPSILON);
        }

    }

}


