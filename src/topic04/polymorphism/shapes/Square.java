
package topic04.polymorphism.shapes;


public  class Square extends TwoDimensionalShape{
    
    public double side;
    
    public Square(double side){
        super();
        this.side=side;
    }
    
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public  double getPerimeter(){
        return side*4;
    }

    
    public String toString(){
        return super.toString()+" square:  " + side;
    }
    
}
