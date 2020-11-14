package factory_parttern.model;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public Shape create() {
        return new Rectangle();
    }
}
