
package exams.previous.quizzes.fall2015.major2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SensorSet <T extends Comparable<T> & Readable>{
    
    Set <T> set ;
    
    public SensorSet(){
        set = new TreeSet<T>();
    }
    
    public SensorSet(List <T> list){
        set = new TreeSet<T>(list);
    }
    
    
    public void add (T t){
        set.add(t);
    }
    
    public boolean remove(T t){
        return set.remove(t);
    }
    
    public T getMax(){
        return Collections.max(set);
    }
    
    public T getMin(){
        return Collections.min(set);
    }
    
    public double getAverage(){
        double sum=0;
        
        Iterator <T> it = set.iterator();
        while(it.hasNext()){
            T t = it.next();
            sum+=t.getValue();
        }
        return sum/set.size();
    }
    
    
}
