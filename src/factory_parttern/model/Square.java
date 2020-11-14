package factory_parttern.model;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public Shape create() {
        return new Square();
    }
}
