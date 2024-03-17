package gr.aueb.cf.ch17;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {
    double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    //Copy Constructor
    public Line(Line line) {
        super(line.getId());
        this.length = line.length;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
