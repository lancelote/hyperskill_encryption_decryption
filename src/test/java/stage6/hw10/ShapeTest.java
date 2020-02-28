package stage6.hw10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapeTest {}

class TriangleTest {
    private final Triangle triangle = new Triangle(3, 4, 5);

    @Test
    void getPerimeter() {
        assertEquals(triangle.getPerimeter(), 12.0);
    }

    @Test
    void getArea() {
        assertEquals(triangle.getArea(), 6.0);
    }
}

class RectangleTest {
    private final Rectangle rectangle = new Rectangle(5, 10);

    @Test
    void getPerimeter() {
        assertEquals(rectangle.getPerimeter(), 30.0);
    }

    @Test
    void getArea() {
        assertEquals(rectangle.getArea(), 50.0);
    }
}

class CircleTest {
    private final Circle circle = new Circle(10);

    @Test
    void getPerimeter() {
        assertEquals(circle.getPerimeter(), 62.831853, 0.001);
    }

    @Test
    void getArea() {
        assertEquals(circle.getArea(), 314.159265, 0.001);
    }
}
