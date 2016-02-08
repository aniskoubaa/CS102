/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TemperatureTest {
    public static void main(String []args){
        
        ArrayList<Temperature> tempList = new ArrayList<Temperature>();
        tempList.add(new Temperature (14.5, 'C', new Date(1,1,2016)));
        Temperature t2 = new Temperature (80.5, 'F', new Date(2,1,2016));
        tempList.add(t2);
        tempList.add(new Temperature (32.4, 'C', new Date(3,1,2016)));
        
        tempList.get(1).setValue(90.3);
        tempList.get(1).getDate().setDay(5);
        tempList.get(2).converToF();
        
        try {
            FileWriter fw = new FileWriter(new File("temp.txt"));
            for (Temperature t:tempList){
                fw.write(t.toString() + " "+ t.getDate()+"\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("File IO Exception");
        }
        
        
        
        
    }
    
}
