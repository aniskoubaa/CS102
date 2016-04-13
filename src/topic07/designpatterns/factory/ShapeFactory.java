
package topic07.designpatterns.factory;


public class ShapeFactory {

    public Shape create(String shapeType){
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle(1.);
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square(1.0);
        }else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle(1.0, 2.0);
        }else if (shapeType.equalsIgnoreCase("Cube")){
            return new Cube(1.0);
        }
        return null;
    }
    
    public Shape create(String shapeType, double d1){
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle(d1);
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square(d1);
        }else if (shapeType.equalsIgnoreCase("Cube")){
            return new Cube(d1);
        }
        return null;
    }
    
    public TwoDimensionalShape create2D(String shapeType, double d1){
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle(d1);
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square(d1);
        }
        return null;
    }
    public ThreeDimensionalShape create3D(String shapeType, double d1){
        if (shapeType.equalsIgnoreCase("Cube")){
            return new Cube(d1);
        }
        return null;
    }
    
    public Shape create(String shapeType, double d1, double d2){
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle(d1, d2);
        }
        return null;
    }
    
}
