/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.usinginheritance;



public class Temperature extends Sensor{

    public static double c2f = 32;

    public Temperature(double value, Character unit) {
        super(value, unit);
        setUnit(unit);
    }
    
    @Override

    public void setUnit(Character unit) {
        if ((unit.charValue()=='C')||(unit.charValue()=='F'))
            setUnit(unit);
        else new IllegalArgumentException("Wrong unit format");
        
    }

    public Temperature convertToCelsius(){
        if (getUnit().charValue()=='C')
            System.out.println("Same unit, no conversion");
        else {
            setValue(getValue()-c2f);
            setUnit('C');
        }
       return (this) ;
    }
    
    public Temperature convertToFahrenheit(){
        if (getUnit().charValue()=='F')
            System.out.println("Same unit, no conversion");
        else {
            setValue(getValue()+c2f);
            setUnit('F');
        }
        return (this) ;            
    }
    
}
