package factory_parttern.model;

public interface Shape<T> {
    void draw();
    Shape create();
}
