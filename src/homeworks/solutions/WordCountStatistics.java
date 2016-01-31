/*
 * Write a Java program that reads the text file "files/words.txt"
 * The program must read the file line by line
 * The program parses each line that it reads by using all 
 * these delimiters  \t,;.?!-:@[](){}_*
 * It is recommended to use StringTokenizer st = new StringTokenizer(line, delimiters);
 * or use slipt() as we did before.
 * For example, for this line: 
 * Optique_et_Precision_de_Levallois
 * contains five words: Optique et Precision de Levallois
 * You should count the number of occurence of every word
 * The program at the end should display the following
 *     the most frequent word is ???? with ??? occurrences
 *     the less frequent word is ???? with ??? occurrences
 *     the total number of words is ????
 *     list of 10 most frequent words
 * Hint: you can think of a structure of two dimensions: 
 * one to store words and one to store their occurences
 */
package homeworks.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WordCountStatistics {
    public static void main(String []args){
        
        String mostFrequentWord=null;
        String lessFrequentWord=null;
        int totalNumberofWord = 0;
        int numberOfOccurenceOfMostFrequentWord = 0;
        int numberOfOccurenceOfLessFrequentWord = 0;
        String delimiters = " \t,;.?!-:@[](){}_*/";
        Scanner input=null;
        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<Integer> countList = new ArrayList<Integer>();
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
                if (!wordList.contains(word)){
                    wordList.add(word);
                    countList.add(1);
                }else{
                    int index = wordList.indexOf(word);
                    countList.set(index, countList.get(index)+1);
                }                
            }            
        }
        
        numberOfOccurenceOfMostFrequentWord = Collections.max(countList);
        int i = countList.indexOf(numberOfOccurenceOfMostFrequentWord);
        mostFrequentWord = wordList.get(i);
        
        numberOfOccurenceOfLessFrequentWord = Collections.min(countList);
        i = countList.indexOf(numberOfOccurenceOfLessFrequentWord);
        lessFrequentWord = wordList.get(i);
        
                
        totalNumberofWord = wordList.size();
        
        /** DISPLAY RESULTS **/
        System.out.printf("the most frequent word is [%s] with [%d] occurrences\n", 
                mostFrequentWord, numberOfOccurenceOfMostFrequentWord);
        System.out.printf("the less frequent word is %s with %d occurrences\n",
        lessFrequentWord, numberOfOccurenceOfLessFrequentWord);
        System.out.printf("the total number of words is %d\n",
                totalNumberofWord);
        
        System.out.printf("the list of the 10 most frequent words is: \n");
        for (i=0;i<10;i++){
            numberOfOccurenceOfMostFrequentWord = Collections.max(countList);
            int k = countList.indexOf(numberOfOccurenceOfMostFrequentWord);
            mostFrequentWord = wordList.get(k);
            System.out.println((i+1)+"- {"+wordList.get(k)+"} repated {"+countList.get(k)+"}");
            countList.remove(k);
            wordList.remove(k);
        }
        
    }
    
}
