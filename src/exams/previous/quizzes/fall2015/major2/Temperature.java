package exams.previous.quizzes.fall2015.major2;

public class Temperature extends Sensor{
    

    public static double c2f = 32;

    public Temperature(double value, Character unit) {
        super(value, unit);
    }
    
    @Override
    public void setUnit(Character c){
        
        if ((c.charValue()=='C')||(c.charValue()=='F'))
            this.unit = c;
        else new IllegalArgumentException("Wrong unit format");
        
    }

    public Temperature convertToCelsius(){
        if (unit=='C'){
            //System.out.println("Same unit, no conversion");
        }
        else {
            setValue(value-c2f);
            setUnit('C');
        }
       return (this) ;
    }
    
    public Temperature convertToFahrenheit(){
        if (unit=='F'){
            //System.out.println("Same unit, no conversion");
        }
        else {
            setValue(value+c2f);
            setUnit('F');
        }
        return (this) ;            
    }

}
