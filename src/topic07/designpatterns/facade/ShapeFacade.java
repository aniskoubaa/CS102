package topic07.designpatterns.facade;


public class ShapeFacade {


    public static double getPerimeter(Shape c){
        return c.getPerimeter();
    }
    
    public static double getArea(TwoDimensionalShape t){
        return t.getArea();
    }
    
    public static double getVolume(ThreeDimensionalShape t){
        return t.getVolume();
    }
    
}
