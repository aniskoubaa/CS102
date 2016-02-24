/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.classes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author akoubaa
 */
public class TimeTest {
    public static void main(String[]args){
        
        Time t1 = new Time(13,3,0);
        System.out.println("t1= "+t1.toStandardString());
        System.out.println("t1= "+t1.toUniversalString());
        
        Time t2 = new Time();
        
        Time t3 = new Time(3,8,49);
        
        Time t4 = new Time(t1);
        t4.setHour(15);
        
        System.out.println("t4= "+ t4.toStandardString());
        
        System.out.println("t1= "+t1.toString());
        System.out.println("t2= "+t2);
        System.out.println("t3= "+t3);
        System.out.println("t4= "+t4);
        
        ArrayList<Time> times = new ArrayList<Time>();
        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(new Time(3,19,43));
        times.add(t4);
       
        System.out.println(times);
        Collections.sort(times);
        System.out.println(times);
        
        System.out.println(t1.compareTo(t4));
        System.out.println(Collections.max(times));
        System.out.println(Collections.min(times));
       
        
    }
    
}
