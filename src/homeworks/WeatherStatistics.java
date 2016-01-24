/*
 * Write a Java program that reads the file "files/weather.data"
 * The program must read the file line by line
 * The program parses each line that it reads
 * For example, for this line: 
 * 19.7|11|1/3/1995
 * The first value is temperature
 * The second value is humidity
 * The last value is the date, composed of day, month, and year 
 * The program must 
 * 1- print each line as the following string:
 *    {"Temperature" = 19.7, "Humidity" = 11, "day"=1, "month" = 3, "year"=1995}
 * 2- Add all temperature values in an ArrayList temperatureList
 * 3- Add all humidity values in an ArrayList humidityList
 * 4- Prints the average temperature as: Average Temperature = avg_temperature_value
 * 5- Prints the average humidity as: Average Hmudidity = avg_humidity_value
 * Save the average value of temperature and humidity in a file with name "statistics.txt" in the form
 * year:temperature average:hmudity average
 */


package homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WeatherStatistics {
    
  public static double getAverage(ArrayList<Double> list){
      double sum = 0.0;
      /*
      for (int i=0;i<list.size();i++){
          sum =sum + list.get(i);
      }
      */
      //for each statement
      for (Double d : list){
          sum += d;
      }
      
      return sum/list.size();
      
      
  }  
  
  public static double getAverageInt(ArrayList<Integer> list){
      double sum = 0.0;
      
      //for each statement
      for (Integer x : list){
          sum += (double)x;
      }
      
      return sum/list.size();
      
      
  }  
    
    
    public static void main(String []args){
       
        
        ArrayList <Double> temperatureList = new ArrayList<Double>();
        ArrayList <Integer> humidityList = new ArrayList<Integer>();
        int year=0;
        File file = new File("files/weather.txt");
        Scanner scanner =null;
        try {
            scanner = new Scanner (file);
        } catch (FileNotFoundException ex) {
            System.out.println("Exception "+ ex);
        }
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] values = line.split(";|/");
            
            double temperature = Double.parseDouble(values[0]);
            int humidity = Integer.parseInt(values[1]);
            int day = Integer.parseInt(values[2]);
            int month = Integer.parseInt(values[3]);
             year = Integer.parseInt(values[4]);
            
            
            System.out.printf("{\"Temperature\" = %.2f, "
                    + "\"Humidity\" = %d, "
                    + "\"day\"=%d, \"month\" = %d, "
                    + "\"year\"=%d}\n", temperature,
            humidity, day, month, year);
            
            temperatureList.add(temperature);
            humidityList.add(humidity);            
        }            
        
        double t_avg = getAverage(temperatureList);
        double h_avg = getAverageInt(humidityList);
        System.out.println("average of temperature: "+ t_avg);
        System.out.println("average of humidity: "+h_avg);
        
        
        File fileOutput = new File("files/statistics.txt");
        //FileWriter fw ;
        
      try {
          FileWriter  fw = new FileWriter(fileOutput);
          String s = String.format("%d:%.2f:%.2f", year, t_avg, h_avg);
          fw.write(s);
          fw.close();
      } catch (IOException ex) {
          System.out.println("Exception in FileWriter");
      }
        
    }
    
}
