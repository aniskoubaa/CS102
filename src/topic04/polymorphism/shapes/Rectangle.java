
package topic04.polymorphism.shapes;


public class Rectangle extends TwoDimensionalShape{
    
    private double length;
    private double width;
    
     public Rectangle(double length, double width){
        super();
        this.length=length;
        this.width=width;
    }
    
    public double getArea(){
        return length*width;
    }
    
    @Override
    public  double getPerimeter(){
        return 2*(length+width);
    }
    
   
    public String toString(){
        return super.toString()+" rectangle:  " + length +","+width;
    }
    
}
