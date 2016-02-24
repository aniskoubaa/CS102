/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.polymorphism.shapes;


public abstract class TwoDimensionalShape extends Shape
implements Comparable<TwoDimensionalShape>{
    
    public TwoDimensionalShape(){
        super();
    }
    
    @Override
    public int compareTo(TwoDimensionalShape tds){
        if (this.getArea()>tds.getArea())
            return 1;
        else if (this.getArea()<tds.getArea())
            return -1;
        return 0;
    }
    
    public abstract double getArea();
    
}
