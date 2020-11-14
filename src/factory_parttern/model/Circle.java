package factory_parttern.model;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    public Shape create() {
        return new Circle();
    }
}
