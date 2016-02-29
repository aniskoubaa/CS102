/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.major01.withoutinheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akoubaa
 */
public class Weather {
    
    public static void main(String[]args) throws FileNotFoundException{
        
        ArrayList<Measurement> ml = new ArrayList<Measurement>();
        
        for (int i=1; i<20; i++){
            
            String fileName="log_fake_data/fake_weather_riyadh_"+i+".txt";
            Scanner fileInput = new Scanner (new File(fileName));
            
            while (fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                String [] dataArray = line.split("\\|");
                double temperature = Double.parseDouble(dataArray[0]);
                double humidity = Double.parseDouble(dataArray[1]);
                String []dateStr= dataArray[2].split("/");
                int day= Integer.parseInt(dateStr[0]);
                Date date = new Date(Integer.parseInt(dateStr[0]),Integer.parseInt(dateStr[1]),Integer.parseInt(dateStr[2]));
                Measurement m = new Measurement(new Temperature(temperature, 'C'), new Humidity(humidity), date);
                ml.add(m);
            }
            
        }
    }
    
}
