/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordCountStatisticsMap {
    public static void main(String []args){
        
        String mostFrequentWord=null;
        String lessFrequentWord=null;
        int totalNumberofWord = 0;
        int numberOfOccurenceOfMostFrequentWord = 0;
        int numberOfOccurenceOfLessFrequentWord = 0;
        String delimiters = " \t,;.?!-:@[](){}_*/";
        Scanner input=null;

        Map <String, Integer> wordMap = new TreeMap<String, Integer>();
        try {
            /** DO YOU WORK HERE **/
            input = new Scanner(new File("files/words.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordCountStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            //System.out.println(line);
            StringTokenizer st = new StringTokenizer(line, delimiters);
            
            while (st.hasMoreTokens()){
                String word = st.nextToken().toLowerCase();
                //System.out.println(word);
                //System.out.println(st.nextElement());
                if (!wordMap.containsKey(word)){
                    wordMap.put(word, 1);
                }else{
                    int count = wordMap.get(word);
                    wordMap.put(word, count+1);
                }                
            }            
        }
        
        
        
    }
    
}
