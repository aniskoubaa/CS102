
package exams.previous.quizzes.fall2015.major01.usinginheritance;

public class Measurement extends Object{
    
    private WeatherSensor weatherSensor;
    private Date date;

    public Measurement() {
    }

    public Measurement(WeatherSensor weatherSensor, Date date) {
        setWeatherSensor(weatherSensor);
        setDate(date);
    }

    public WeatherSensor getWeatherSensor() {
        return weatherSensor;
    }

    public void setWeatherSensor(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
    }

    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
   
    
    @Override
    public String toString() {
        return String.format("{%s D=%s}", 
                this.getWeatherSensor().toString(), 
                this.getDate());
    }
    
    
}
