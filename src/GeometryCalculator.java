public class GeometryCalculator {

    public static double getCircleSquare(double radius  ) {
        return radius;
    }

    public static double getSphereVolume(double radius) {
        return radius;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {

        if ( b + c < a || a + b < c || a + c < b )
        {
            return false;
        }
        else
        {

            return true;
        }

    }

    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        if ( b + c < a || a + b < c || a + c < b )
        {
            return -1;
        }
        else
        {
            double s = Math.sqrt( p* (p-a) * (p-b) * (p-c));
            return s;
        }

    }
}
