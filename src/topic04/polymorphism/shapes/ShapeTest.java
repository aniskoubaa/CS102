package topic04.polymorphism.shapes;

import java.util.ArrayList;
import java.util.Collections;


public class ShapeTest {
    public static void main(String []args){
        Circle c = new Circle(2.3);
        Square s = new Square(2.4);
        Rectangle r = new Rectangle(1.2, 3.4);
        //Shape shape = new Circle(1.0);

        //Shape shape2 = new Circle(2.4);
        
        //shape.radius;
       // double x=c.radius;
        
        System.out.println(c.getArea());
        System.out.println(s.getArea());
        System.out.println(r.getArea());
        
        ArrayList<Circle> circles = new ArrayList<Circle>();       
        ArrayList<Square> squares = new ArrayList<Square>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
       
        
        circles.add(c);
         circles.add(new Circle(6.3));
         circles.add(new Circle(4.7));
         //circles.add(r);
        rectangles.add(r);
        squares.add(s);
        
        
        
        
        for (Circle x : circles){
            //System.out.println(x);
        }
        
        for (Rectangle x : rectangles){
            //System.out.println(x);
        }
        
        for (Square y : squares){
            //System.out.println(y);
        }
        
        ArrayList<TwoDimensionalShape> shapes = 
                new ArrayList<TwoDimensionalShape>();
        shapes.add(r);
        //circles.add(r);
        shapes.add(c);
        shapes.add(s);
        shapes.add(new Circle(2.3));
        shapes.add(new Square(4.3));
        //shapes.add(new Shape());
        int counter=0;
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                counter++;
                Circle cx = (Circle)shape;
                System.out.println(cx.getRadius());
                System.out.println(cx.toString());
            }
            
            System.out.println(counter);
                
        }
        
        System.out.println("List of Shapes:"+shapes);
        
        System.out.println("List of Shapes After Sorting:"+shapes);

        
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("CS102");
        strList.add("Riyadh");
        strList.add("Age");
        strList.add("Yellow");
        strList.add("CS210");
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
        
        System.out.println("max: "+Collections.max(strList));
        System.out.println("min: "+Collections.min(strList));
        
        

        Collections.sort(shapes);
        
        s.compareTo(c);
        s.compareTo(new Square(2.0));
       
        
        
    
    }
    
    
}
