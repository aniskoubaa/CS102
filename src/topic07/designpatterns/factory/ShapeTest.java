
package topic07.designpatterns.factory;


public class ShapeTest {
    
    public static void main(String []args){
        
        /*
        TwoDimensionalShape circle = new Circle(2.3);
        Shape square = new Square(4.6);
        Shape cube = new Cube (3.1);
        Shape rectange = new Rectangle(2.3,5.1);
        */
        ShapeFactory sf = new ShapeFactory();
        TwoDimensionalShape circle = sf.create2D("Circle", 2.3);
        TwoDimensionalShape square = sf.create2D("Square", 4.6);
        ThreeDimensionalShape cube = sf.create3D("Cube", 3.1);
        
        System.out.println("circle perimeter: "+ circle.getPerimeter());
        System.out.println("circle area: "+ circle.getArea());
        
        System.out.println("cube volume: "+ cube.getVolume());
        
    }
    
}
