package fr.fms.entities;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(double radius, Point center) {
        super(center);

        setRadius(radius);
    }
    public Circle() {
        super(1, 1);
        setRadius(1);
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        if(radius<0)radius =1;
        else this.radius =radius;
    }


    @Override
    public double area() {
        return Math.PI*this.radius * this.radius;
    }


    @Override
    public String toString() {
        return "Circle radius = " + radius + " " + " Area = " + area();
    }
}
