
package exams.previous.quizzes.fall2015.major2;

import java.util.Comparator;


public class MeasurementComparator implements Comparator<Measurement>{
   
    public int compare(Measurement m1, Measurement m2){
        if (m1.getWeatherSensor().getHumidity().
                compareTo(m2.getWeatherSensor().getHumidity())!=0)
            
        return m1.getWeatherSensor().getHumidity().
                compareTo(m2.getWeatherSensor().getHumidity());
        else
            return m1.getWeatherSensor().getTemperature().
                compareTo(m2.getWeatherSensor().getTemperature());
    }
    
}
