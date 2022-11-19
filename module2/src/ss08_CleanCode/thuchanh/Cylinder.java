package ss08_CleanCode.thuchanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        return getVolume(height, baseArea, perimeter);
    }

    private static double getVolume(int height, double baseArea, double perimeter) {
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
