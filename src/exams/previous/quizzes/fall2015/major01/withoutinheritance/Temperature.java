/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.withoutinheritance;



public class Temperature {
    
    private double value;
    private Character unit;
    
    public static double c2f = 32;

    public Temperature(double value, Character unit) {
        setValue(value);
        setUnit(unit);
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

    public void setUnit(Character unit) {
        if ((unit.charValue()=='C')||(unit.charValue()=='F'))
            this.unit = unit;
        else new IllegalArgumentException("Wrong unit format");
        
    }

    
    
    
    
    public Temperature convertToCelsius(){
        if (unit.charValue()=='C')
            System.out.println("Same unit, no conversion");
        else {
            setValue(value-c2f);
            setUnit('C');
        }
       return (this) ;
    }
    
    public Temperature convertToFahrenheit(){
        if (unit.charValue()=='F')
            System.out.println("Same unit, no conversion");
        else {
            setValue(value+c2f);
            setUnit('F');
        }
        return (this) ;            
    }
    
    public String toString(){
        return String.format("%.2f %s", this.getValue(), this.getUnit());
                
    }
 
}
