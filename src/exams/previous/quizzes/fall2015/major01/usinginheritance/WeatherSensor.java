/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.usinginheritance;

public class WeatherSensor {
    
    private Temperature temperature;
    private Humidity humdity;

    public WeatherSensor(Temperature temperature, Humidity humdity) {
        setTemperature(temperature);
        setHumidity(humdity);
    }
    
    
    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Humidity getHumdity() {
        return humdity;
    }

    public void setHumidity(Humidity humdity) {
        this.humdity = humdity;
    }
    
    public String toString(){
        return String.format("T=%s; H=%s", 
                this.getTemperature(), this.getHumdity());
    }
    
    
}
