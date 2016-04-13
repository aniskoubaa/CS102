/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic07.designpatterns.factory;


public class Cube implements ThreeDimensionalShape{
    
    private double side;
    
    public Cube(){
        super();
    }
    public Cube(double side){
        super();
        this.side=side;
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
