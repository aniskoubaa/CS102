package exams.previous.quizzes.fall2015.major01.usinginheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherApp {
    
    public static ArrayList<Measurement> measurementList = 
            new ArrayList<Measurement>();
    
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
            Date date = new Date(
                    Integer.parseInt(dateStr[0]),
                    Integer.parseInt(dateStr[1]),
                    Integer.parseInt(dateStr[2]));
            WeatherSensor ws = new WeatherSensor(
                            new Temperature(temperature,t_unit),
                            new Humidity(humidity,h_unit));
            
            Measurement m = new Measurement(
                    ws,
                    date);
            measurementList.add(m);
            
        }       
        
    }
    
    public static void main(String []args) throws IOException{
        
        WeatherApp.LoadFromFile("majorexam_weather.txt");
        System.out.println("measurementList: "+measurementList);
       
        double sum=0;
        for (int i=0; i<measurementList.size();i++)
            sum=sum+measurementList.get(i).getWeatherSensor().getTemperature().convertToCelsius().getValue();

        System.out.printf("average temperature = %.2f\n", sum/measurementList.size());
             
    }  
}
