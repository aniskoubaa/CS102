/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz1;


public class Temperature {
    
    private double value;
    private char unit;
    private Date date;
    
    public Temperature(double value, char unit, Date date){
        setValue(value);
        setUnit(unit);
        setDate(date);
    }
    
    public void setValue(double value){
        this.value=value;
    }
    
    public void setUnit(char u){
        if ((u=='F')||(u=='f')||(u=='C')||(u=='c'))
            this.unit=u;
        else new IllegalArgumentException("the unit is not valid");
    }
    
    public void setDate(Date d){
        this.date = new Date(d);
    }
    
    public double getValue(){
        return value;
    }
    
    public char getUnit(){
        return unit;
    }
    
    public Date getDate(){
        return date;
    }
    
    public Temperature converToCelsius (){
        if ((unit=='F')||(unit=='f')){
            setUnit('C');
            setValue((getValue()-32)/1.8);
        }else
            System.out.println("Same unit, no conversion");
       return new Temperature(this.value, this.getUnit(), this.getDate());     
    }
    
    public Temperature converToF (){
        if ((unit=='C')||(unit=='c')){
            setUnit('F');
            
            setValue(getValue()*1.8+32);
        }else
            System.out.println("Same unit, no conversion");
       return new Temperature(this.value, this.getUnit(), this.getDate());     
    }
    
    public String toString(){
        return String.format("%.2f %c", getValue(), getUnit());
    }
    
    
    
    
}
