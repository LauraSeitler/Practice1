package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculateAreaTest extends TestCase {
    @Test
    public void testRectangleArea (){
    double area = CalculateArea.calculateArea(ShapeType.RECTANGLE, 5, 3);
    assertEquals(50, area, 0.001 );
    }
    @Test
    public void testSquareArea (){
        double area = CalculateArea.calculateArea(ShapeType.SQUARE, 4);
        assertEquals(8, area, 0.001 );
    }
    @Test
    public void testCircleArea (){
        double area = CalculateArea.calculateArea(ShapeType.CIRCLE, 3);
        assertEquals(28.1074, area, 0.001 );
    }
    @Test (expected = RuntimeException.class)
    public void testInvalidShape(){
        CalculateArea.calculateArea (null);
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidRectangleShape(){
        CalculateArea.calculateArea(ShapeType.RECTANGLE, 4);
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidSquareShape(){
        CalculateArea.calculateArea(ShapeType.SQUARE, 4, 5);
    }
    @Test (expected = RuntimeException.class)
    public void testInvalidCIRCLEShape(){
        CalculateArea.calculateArea(ShapeType.CIRCLE);
    }
}