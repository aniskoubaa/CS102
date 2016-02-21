
package topic04.polymorphism.shapes;


public class Circle extends Shape{
    
    public double radius;
    
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2.0);
    }
    
    public String toString(){
        return super.toString()+" circle:  " + radius;
    }
    
}
