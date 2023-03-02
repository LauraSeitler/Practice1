package org.example;

public class CalculateArea {
    public static double calculateArea(ShapeType shapeType, double... parameters) {
        switch (shapeType) {
            case RECTANGLE:
                if (parameters.length != 2) {
                throw new RuntimeException("this is not how you calculate the area of a rectangle");
            }
            return parameters[0] * parameters[1];
            case SQUARE:
                if (parameters.length != 1) {
                throw new RuntimeException("this is not how you calculate the area of a square");
            }
            return parameters[0] * parameters[0];
            case CIRCLE:
                if (parameters.length != 1) {
                throw new RuntimeException("this is not how you calculate the area of a circle");
            }
            return Math.PI * parameters[0] * parameters[0];
            default:
                throw new RuntimeException("not a valid shape");
        }

    }
}

/*
Calculate Shape Area

Create a CalculateArea class with a static method called calculateArea to calculate
the area of a shape. This method should receive an enum ShapeType that could be RECTANGLE, SQUARE,
CIRCLE and the parameters needed to calculate the area of the shape. If parameters are not given throw a
RuntimeException with a message. Write all tests.

Hint: You can use Varargs to pass n parameters
 */