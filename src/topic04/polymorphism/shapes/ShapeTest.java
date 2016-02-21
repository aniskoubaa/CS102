package topic04.polymorphism.shapes;

import java.util.ArrayList;


public class ShapeTest {
    public static void main(String []args){
       Circle c = new Circle(2.3);
        Square s = new Square(2.4);
        Rectangle r = new Rectangle(1.2, 3.4);
    
        System.out.println(c.getArea());
        System.out.println(s.getArea());
        System.out.println(r.getArea());
        
        ArrayList<Circle> circles = new ArrayList<Circle>();       
        ArrayList<Square> squares = new ArrayList<Square>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
       
        
        circles.add(c);
         circles.add(new Circle(2.3));
        rectangles.add(r);
        squares.add(s);
        
        for (Circle x : circles){
            System.out.println(x);
        }
        
        for (Square y : squares){
            System.out.println(y);
        }
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(r);
        //circles.add(r);
        shapes.add(c);
        shapes.add(s);
        shapes.add(new Circle(2.3));
        shapes.add(new Square(4.3));
        shapes.add(new Shape());
        
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        
        
    
    }
    
    
}
