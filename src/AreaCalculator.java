/* ***************************************************************************
This is a comment about the MegaBytesConverter class/methods.
*************************************************************************** */
public class AreaCalculator {

    public static double area(double radius) { // circle area
        if (radius < 0) {
            return -1.0;
        }
        double circleArea = (radius * radius) * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) { // rectangle area
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }
}
