package geometry;

public class Circle {
    
    private static final double DEFAULT_RADIUS = 1.0;
    private double radius;
    
    public Circle() { this(DEFAULT_RADIUS); }
    public Circle(double radius) { 
        if (radius < DEFAULT_RADIUS) radius = DEFAULT_RADIUS;
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    
    // return (boolean) false if fail
    public boolean setRadius(double radius) {
        if (radius < DEFAULT_RADIUS) return false;
        this.radius = radius;
        return true;
    }
    public double computeArea() { return Math.PI * radius * radius; }
    
    @Override
    public String toString() { return "Circle(" + radius + ")"; }
}
