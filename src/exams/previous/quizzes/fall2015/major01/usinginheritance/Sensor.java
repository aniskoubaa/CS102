
package exams.previous.quizzes.fall2015.major01.usinginheritance;


public class Sensor {
    
    private double value;
    private Character unit;
    
    
    public Sensor(double value, Character unit){
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
                  this.unit = unit;        
    }
    
    @Override
        public String toString(){
            return String.format("%.2f %s", this.getValue(), this.getUnit()); 
        }
    
    
}
