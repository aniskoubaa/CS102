
package topic04.polymorphism.shapes;


public  class Square extends TwoDimensionalShape {
    
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
    
   @Override
    public int compareTo(TwoDimensionalShape tds){
     
        if (tds instanceof Square){
            //System.out.println("comparing the side");
            Square s = (Square)tds;
            if (this.side>s.side){
                return 1;
            }else if (this.side<s.side){
                return -1;
            }
            return 0;
        }else{
            //System.out.println(" comparing the area");
            return super.compareTo(tds);
        }

    }

    
    public String toString(){
        return super.toString()+" square:  " + + getArea();
    }
    
}
