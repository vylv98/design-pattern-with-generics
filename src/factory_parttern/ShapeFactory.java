package factory_parttern;

import factory_parttern.model.Circle;
import factory_parttern.model.Rectangle;
import factory_parttern.model.Shape;
import factory_parttern.model.Square;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory<T extends Shape> {

    private static Map<Class, Shape<?>> classShapeMap = new HashMap<>();

    static {
        classShapeMap.put(Circle.class, new Circle());
        classShapeMap.put(Rectangle.class, new Rectangle());
        classShapeMap.put(Square.class, new Square());
    }

    public static<T> T getShapeService(Type typeTarget) {
        if(classShapeMap.containsKey(typeTarget)) {
            return (T) classShapeMap.get(typeTarget);
        } else {
            throw new IllegalArgumentException("Unknow type");
        }
    }
}
