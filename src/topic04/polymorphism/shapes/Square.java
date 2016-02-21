
package topic04.polymorphism.shapes;


public class Square extends Shape{
    
    public double side;
    
    public Square(double side){
        super();
        this.side=side;
    }
    
    public double getArea(){
        return side*side;
    }
    
    public String toString(){
        return super.toString()+"square:  " + side;
    }
    
}
