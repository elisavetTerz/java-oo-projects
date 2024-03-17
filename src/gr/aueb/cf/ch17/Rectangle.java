package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    //Copy Constructor
    public Rectangle(Rectangle rectangle) {
        super(rectangle.getId());
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (width + height));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(this.width, rectangle.width) != 0) return false;
        return Double.compare(this.height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public Rectangle clone() {
        try {
            Rectangle clone = (Rectangle) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
