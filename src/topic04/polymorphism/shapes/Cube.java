/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.polymorphism.shapes;

public class Cube extends ThreeDimensionalShape{
    
    private double side;
    
    public Cube(){
        super();
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public double getPerimeter() {
        return 12*side; 
    }
    
    

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    
    
}
