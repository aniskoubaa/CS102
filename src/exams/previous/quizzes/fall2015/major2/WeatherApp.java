package exams.previous.quizzes.fall2015.major2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class WeatherApp {
    
    public static ArrayList<Measurement> measurementList = new ArrayList<Measurement>();
    /** TODO: declare the two sets for Temperature and Humidity **/
    static SensorSet<Sensor> tSet = new SensorSet<Sensor> ();
    static SensorSet<Sensor> hSet = new SensorSet<Sensor> ();
    public static void LoadFromFile(String fileName) throws FileNotFoundException{
        
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()){
            //14.50;C;2.33;%;1/1/2015;
        String line = input.nextLine();
            String [] dataArray = line.split(";");
            double temperature = Double.parseDouble(dataArray[0]);
            char t_unit = dataArray[1].charAt(0);
            double humidity = Double.parseDouble(dataArray[2]);
            char h_unit = dataArray[3].charAt(0);
            String []dateStr= dataArray[4].split("/");
            int day= Integer.parseInt(dateStr[0]);
            Date date = new Date(Integer.parseInt(dateStr[0]),Integer.parseInt(dateStr[1]),Integer.parseInt(dateStr[2]));
            Humidity hm = new Humidity(humidity,h_unit);
            //System.out.println(hm);
            Temperature tp = new Temperature(temperature,t_unit);
            //System.out.println(tp);
            Measurement m = 
                    new Measurement(new WeatherSensor(tp,hm), date);
            measurementList.add(m);
            
            /** TODO: add missing code to add Temperature and Humidity in their sets **/
            hSet.add(hm);
            tSet.add(tp);
            
        }       
        
    }
    
    public static void main(String []args) throws IOException{
        
        WeatherApp.LoadFromFile("majorexam_weather.txt");
        System.out.println("measurementList: "+measurementList);
       
        /** TODO: sort the measurementList as requested in the exam **/
        Collections.sort(measurementList, new MeasurementComparator());

        /** TODO: Temperature Statistics: complete the missing code **/
        System.out.println("Temperature Statistics");
        System.out.println("Max: "+ tSet.getMax());
        System.out.println("Min: "+ tSet.getMin());
        System.out.println("Average: "+ tSet.getAverage());
        
        /** TODO: Humidity Statistics: complete the missing code **/
        System.out.println("Humidity Statistics");
        System.out.println("Max: "+ hSet.getMax());
        System.out.println("Min: "+ hSet.getMin());
        System.out.println("Average: "+ hSet.getAverage());
    }  
}
