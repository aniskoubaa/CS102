/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapTest {
    public static void main(String[]args){
        
        String sentence ="this is a very interesting course. this is great";
        
        String [] words = sentence.split(" ");
        
        Map<String, Integer> wordCountMap = 
                new TreeMap<String, Integer>();
        
        for (String w : words){
            
            if (!wordCountMap.containsKey(w)){
                wordCountMap.put(w, 1);
            }else{
                int count = wordCountMap.get(w);
                wordCountMap.put(w, count+1);
            }
            
        }
        //System.out.println(wordCountMap);
        
        Set <String> keySet = wordCountMap.keySet();
        System.out.printf("%-15s %-15s\n", "KEY","VALUE");
        for (String key : keySet){
            System.out.printf("%-15s %-15s\n",key, wordCountMap.get(key));
        }
        
        Collection <Integer> c= wordCountMap.values();
        double sum=0;
        for (Integer i : c){
            sum = sum + i;
        }
        System.out.println(sum/c.size());
        
        System.out.println(Collections.max(c));
    }
    
}
