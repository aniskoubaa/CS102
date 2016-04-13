
package topic07.designpatterns.facade;


public  class Square implements TwoDimensionalShape {
    
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
        return super.toString()+" square:  " + + getArea();
    }
    
}
