package factory_parttern;

import factory_parttern.model.Circle;
import factory_parttern.model.Rectangle;

public class main {
    public static void main(String[] args) {
        Circle circle = ShapeFactory.getShapeService(Circle.class);
        circle.draw();

        Rectangle rectangle = ShapeFactory.getShapeService(Rectangle.class);
        rectangle.draw();
    }
}
