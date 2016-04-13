package exams.previous.quizzes.fall2015.major2;

public class Measurement implements Comparable<Measurement>{
    
    private WeatherSensor weatherSensor;
    private Date date;

    public Measurement(WeatherSensor weatherSensor, Date date) {
        this.weatherSensor = weatherSensor;
        this.date = date;
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
        return String.format("{%s D=%s}", this.getWeatherSensor(), this.getDate());
    }
    
    public int compareTo(Measurement m){
        if (this.getWeatherSensor().getTemperature().
                compareTo(m.getWeatherSensor().getTemperature())!=0)
            
        return this.getWeatherSensor().getTemperature().
                compareTo(m.getWeatherSensor().getTemperature());
        else
            return this.getWeatherSensor().getHumidity().
                compareTo(m.getWeatherSensor().getHumidity());
    }
    
}
