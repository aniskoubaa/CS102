package exams.previous.quizzes.fall2015.major2;

public class Humidity extends Sensor{
    public Humidity(double value, Character unit) {
        super(value, unit);
    }  
    public Humidity(double value) {
        super(value, '%');
    }
    
    @Override
    public void setUnit(Character unit){
        if (unit.charValue()=='%')
            this.unit=unit;
    }
}
