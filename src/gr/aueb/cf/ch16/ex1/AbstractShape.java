package gr.aueb.cf.ch16.ex1;

public abstract class AbstractShape implements IShape {
    private long id;

    public AbstractShape() {
    }

    public AbstractShape(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return  id;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "id=" + id +
                '}';
    }
}
