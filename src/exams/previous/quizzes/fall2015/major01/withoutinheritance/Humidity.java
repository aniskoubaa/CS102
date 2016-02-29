/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.withoutinheritance;


/**
 *
 * @author akoubaa
 */
public class Humidity {
    
    private double value;
    private Character unit;
    
    

    public Humidity(double value) {
        setValue(value);
        setUnit();
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Character getUnit() {
        return unit;
    }

    public void setUnit() {
        unit = '%';
        
    }

    public String toString(){
        return String.format("%.2f %s", this.getValue(), this.getUnit());
                
    }
    
}
