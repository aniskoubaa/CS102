package exams.previous.quizzes.fall2015.major2;

public class Sensor implements Comparable<Sensor>, Readable{
    
    protected double value;
    protected Character unit;
    
    public Sensor(double value, Character unit) {
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
        this.unit=unit;   
    }
    
    @Override
    public String toString(){
        return String.format("%.2f %s", this.getValue(), this.getUnit());
    }

    public int compareTo(Sensor s){
        if (this.getValue()>s.getValue())
            return 1;
        else if (this.getValue()<s.getValue())
            return -1;
        return 0;
    }
    //this=1.2;
    //s=1.3;
        
}
