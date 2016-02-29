/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.usinginheritance;

public class Humidity extends Sensor{

    public Humidity(double value, Character unit) {
        super(value, unit);
    }
        
    
    
    public Humidity(double value) {
        super(value,'%');
    }
    
}
