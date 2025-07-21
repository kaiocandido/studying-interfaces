public record Circle(int radius) implements GeometricArea{
    private static  final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (radius * radius);
    }
}
