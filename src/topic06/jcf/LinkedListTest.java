/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListTest {
    
    public static void convertToLowerCase(List <String> c){
        
        ListIterator <String> it = c.listIterator();
        
        while(it.hasNext()){
            //String s = it.next();
            it.set(it.next().toLowerCase());
            
        }
        
    }
    
    public static <R> void printReverse(List <R> list){
        
        ListIterator <R>it = list.listIterator(list.size());
        System.out.println("Reverse List");
        while (it.hasPrevious()){
            R s = it.previous();
            System.out.print(s+"\t");
        }
        System.out.println("");
        
        
    }
    
    
    public static void main(String []args){
        List<String> colorList = new LinkedList<String>();
        List<Double> doubleList = new LinkedList<Double>();
        
        colorList.add("BLUE");
        colorList.add("WHITE");
        colorList.add("RED");
        colorList.add("BLACK");
        colorList.add("ORANGE");
        colorList.add("YELLOW");
        colorList.add("BLUE");
        colorList.add("WHITE");
        colorList.add("RED");
        
        List<String> colorToAdd = new LinkedList<String>();
        colorToAdd.add("RED");
        colorToAdd.add("BLACK");
        colorToAdd.add("ORANGE");
        
        System.out.println("colorList: "+colorList);
        colorList.addAll(colorToAdd);
        System.out.println("colorList: "+colorList);
        
        convertToLowerCase(colorList);
        System.out.println("colorList after lower case: "+colorList);
        
        //List<String>sublist = colorList.subList(3, 7+1);
        
        //System.out.println("sublist "+ sublist);
        //sublist.clear();
        //System.out.println("sublist.clear() "+ sublist);
        
        printReverse(colorList);
        
        doubleList.add(1.2);
        doubleList.add(3.2);
        doubleList.add(4.8);
        doubleList.add(5.6);
        
        System.out.println("doubleList "+ doubleList);
        printReverse(doubleList);
        
        Double [] doubleArray = 
                doubleList.toArray(new Double[doubleList.size()]);
        
        String [] colorArray = 
                colorList.toArray(new String[colorList.size()]);
        
        for (int i=0; i<doubleArray.length;i++){
            System.out.print(doubleArray[i]+"\t");
        }
        System.out.println("");
        
        LinkedList<Double> doubleList2 = 
                new LinkedList<Double> (Arrays.asList(doubleArray));
        
        
    }
    
}
