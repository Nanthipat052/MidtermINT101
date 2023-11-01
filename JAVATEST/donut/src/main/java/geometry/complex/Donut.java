package geometry.complex;

import geometry.Circle;

public class Donut {
    // create and set the default minimum thickness of donut (DEFAULT_THICKNESS) to
    // 3.0
    private static final double DEFAULT_THICKNESS = 3.0;
    private Circle innerCircle;
    private Circle outerCircle;

    /*
     * constructor: Donut(innerRadius,outerRadius)
     * create a Donut object and set the radius of the innerCircle to innerRadius
     * (or the minimum radius allowed). Set the radius of the outerCircle to
     * outerRadius (or at least the radius of the innerCircle + DEFAULT_THICJNESS).
     */
    public Donut(double innerRadius, double outerRadius) {
        innerCircle = new Circle(innerRadius);
        double minOuterRadius = innerCircle.getRadius() + DEFAULT_THICKNESS;
        if (outerRadius < minOuterRadius) {
            outerRadius = minOuterRadius;
        }
        outerCircle = new Circle(outerRadius);
    }

    /*
     * constructor: Donut(innerRadius)
     * Create a Donut object and set the radius of the innerCircle to innerRadius
     * (or the minimum radius allowed). Set the radius of the outerCircle so that
     * the thickness of the Donut (= outer radius - inner radius) is the
     * DEFAULT_THICKNESS.
     */
    public Donut(double innerRadius) {
        innerCircle = new Circle(innerRadius);
        outerCircle = new Circle(innerCircle.getRadius() + DEFAULT_THICKNESS);
    }

    /*
     * constructor: Donut()
     * Create a Donut object and set radius of the innerCircle to the default radius
     * of Circle and circle's radius. Set the radius of the outerCircle so that
     * the thickness of the Donut (= outer radius - inner radius) is the
     * DEFAULT_THICKNESS.
     */
    public Donut() {
        innerCircle = new Circle();
        outerCircle = new Circle(innerCircle.getRadius() + DEFAULT_THICKNESS);
    }

    public double getInnerRadius() {
        return innerCircle.getRadius();
    }

    public double getOuterRadius() {
        return outerCircle.getRadius();
    }

    public double computeThickness() {
        return outerCircle.getRadius() - innerCircle.getRadius();
    }

    public double computeArea() {
        return outerCircle.computeArea() - innerCircle.computeArea();
    }

    @Override
    public String toString() {
        return "Donut(" + innerCircle.getRadius() + "," + outerCircle.getRadius() + ")";
    }

    /*
     * change the inner radius of 'Donut', which is the radius of 'innerCircle',
     * to 'innerRadius' and return true. Return false if the inner radius cannot
     * be changed to 'innerRadius'. The inner radius cannot be changed if
     * (1) the 'Circle' class does not allow to have a circle with
     * radius = 'innerRadius', or
     * (2) the new inner radius reduces the thickness of 'Donut'
     * to a value less than 'DEFAULT_THICKNESS'.
     */
    public boolean setInnerRadius(double innerRadius) {
        Circle newInnerCircle = new Circle(innerRadius);
        double newInnerRadius = newInnerCircle.getRadius();
        if (newInnerRadius != innerRadius ||
                outerCircle.getRadius() - newInnerRadius < DEFAULT_THICKNESS) {
            return false;
        }
        innerCircle = newInnerCircle;
        return true;
    }

    /*
     * change the outer radius of 'Donut', which is the radius of 'outerCircle',
     * to 'outerRadius' and return true. Return false if the outer radius cannot
     * be changed to 'outerRadius'. The outer radius cannot be changed if
     * the new outer radius reduces the thickness of 'Donut'
     * to a value less than 'DEFAULT_THICKNESS'.
     */
    public boolean setOuterRadius(double outerRadius) {
        Circle newOuterCircle = new Circle(outerRadius);
        double newInnerRadius = innerCircle.getRadius();
        if (newOuterCircle.getRadius() - innerCircle.getRadius() < DEFAULT_THICKNESS) {
            return false;
        }
        outerCircle = newOuterCircle;
        return true;
    }
}
