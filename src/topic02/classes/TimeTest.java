/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.classes;

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
        
        Time t3 = new Time(3);
        
        Time t4 = new Time(t1);
        
        System.out.println("t4= "+ t4.toStandardString());
        
        System.out.println("t1= "+t1.toString());
        System.out.println("t2= "+t2);
        System.out.println("t3= "+t3);
        System.out.println("t4= "+t4);
    
    }
    
}
