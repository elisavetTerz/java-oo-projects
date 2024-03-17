package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private double radius;

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    //Copy Constructor
    public Circle(Circle circle) {
        super(circle.getId());
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

}
