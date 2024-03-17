package gr.aueb.cf.ch16.ex2;

public class Circle extends AbstractShape implements ICircle {
    private double radius;

    public Circle(long id, double radius) {
        super(id);
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
}
