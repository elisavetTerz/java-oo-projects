package gr.aueb.cf.ch16.ex2;

public class Line extends AbstractShape implements ILine {
    double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }
}
