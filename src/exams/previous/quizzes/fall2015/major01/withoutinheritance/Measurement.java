/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.withoutinheritance;


/**
 *
 * @author akoubaa
 */
public class Measurement {
    
    private Temperature temperature;
    private Humidity humdity;
    private Date date;

    public Measurement() {
    }

    public Measurement(Temperature temperature, Humidity humdity, Date date) {
        this.temperature = temperature;
        this.humdity = humdity;
        this.date = date;
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

    public void setHumdity(Humidity humdity) {
        this.humdity = humdity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    
}
