package topic07.designpatterns.facade;


import java.util.ArrayList;
import java.util.Collections;

public class ShapeTest {
    public static void main(String []args){
        //Factory pattern for shapes
        ShapeFactory sf = new ShapeFactory();
        TwoDimensionalShape c = sf.create2D("Circle");
        TwoDimensionalShape s = sf.create2D("Square");
        TwoDimensionalShape r = sf.create2D("Rectangle", 2.3, 4.5);
        ThreeDimensionalShape cu = sf.create3D("Cube", 3.5);
        
        
        System.out.println(ShapeFacade.getPerimeter(c));
        System.out.println(ShapeFacade.getArea(c));
        System.out.println(ShapeFacade.getVolume(cu));
        
        
        
        
    
    }
    
    
}
