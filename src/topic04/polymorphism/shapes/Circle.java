
package topic04.polymorphism.shapes;


public class Circle extends TwoDimensionalShape{
    
    private double radius;
    
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2.0);
    }
    
    @Override
    public  double getPerimeter(){
        return Math.PI*2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    

    public String toString(){
        return super.toString()+" circle:  " + + getArea();
    }
    
}
