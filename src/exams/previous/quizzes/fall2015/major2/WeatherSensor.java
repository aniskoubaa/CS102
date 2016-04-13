package exams.previous.quizzes.fall2015.major2;

public class WeatherSensor {
    
    private Temperature temperature;
    private Humidity humidity;

    public WeatherSensor(Temperature temperature, Humidity humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    
    
    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        //return "WeatherSensor{" + "temperature=" + temperature + ", humidity=" + humidity + '}';
        return String.format("T=%s; H=%s;", this.getTemperature(), this.getHumidity());
    }
    
    
    
    
    
}
