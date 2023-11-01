package int101wk05;

import geometry.Circle;
import geometry.complex.Donut;

public class Int101Wk05 {

    public static void main(String[] args) {
       System.out.println("### Demo Creation and Usage of Class and Object ###");
       demoCircle();
       demoDonut();
    }

    static void demoCircle() {
       System.out.println("## Demo Circle ##");
       // constructors
       System.out.println("Show Circle(4.0) ... : " + new Circle(4));

       // radius less than the minimum
       System.out.println("Show Circle(0.5) ... : " + new Circle(0.5));
       System.out.println("Show Circle(-5) ... : " + new Circle(-5));

       // use the minimum/default radius
       System.out.println("Show Circle() ... : " + new Circle());

       Circle c = new Circle(3.0);

       //circle.toString()
       System.out.println("c = new Circle(3.0); // c is ... " + c.toString());

       // circle.setRadius(...)
       c.setRadius(5.0);
       System.out.println("c.setRadius(5.0); // c is ... " + c);
       c.setRadius(-10.0);
       System.out.println("c.setRadius(-10.0); // c is ... " + c);

       // circle.getRadius()
       System.out.println("c.getRadius() ... " + c.getRadius());

       // circle.computeArea()
       System.out.println("c.computeArea() ... " + c.computeArea());
    }
    static void demoDonut() {
       System.out.println("## Demo Donut ##");
       // constructors
       System.out.println("Show Donut(3,9) ... : " + new Donut(3,9));
       System.out.println("Show Donut(3,4) ... : " + new Donut(3,4));
       System.out.println("Show Donut(3,1) ... : " + new Donut(3,1));
       System.out.println("Show Donut(0,9) ... : " + new Donut(0,9));
       System.out.println("Show Donut(0,3.5) ... : " + new Donut(0,3.5));
       System.out.println("Show Donut(0.5,2) ... : " + new Donut(0.5,2));
       //
       System.out.println("Show Donut(5) ... : " + new Donut(5));
       System.out.println("Show Donut(-1) ... : " + new Donut(-1));
       //
       System.out.println("Show Donut() ... : " + new Donut());
       
       Donut d = new Donut(4,9);
       System.out.println("Donut d ... " + d.toString());
       System.out.println("d.getInnerRadius() = " + d.getInnerRadius());
       System.out.println("d.getOuterRadius() = " + d.getOuterRadius());
       System.out.println("d.computeThickness() = " + d.computeThickness());
       System.out.println("d.computeArea() = " + d.computeArea());

       d.setInnerRadius(7);
       System.out.println("d.setInnerRadius(7); d = " + d);
       d.setInnerRadius(0.5);
       System.out.println("d.setInnerRadius(0.5); d = " + d);
       d.setInnerRadius(5);
       System.out.println("d.setInnerRadius(5); d = " + d);

       d.setOuterRadius(6);
       System.out.println("d.setOuterRadius(6); d = " + d);
       d.setOuterRadius(0.5);
       System.out.println("d.setOuterRadius(0.5); d = " + d);
       d.setOuterRadius(11);
       System.out.println("d.setOuterRadius(11); d = " + d);
    }
}
