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
 * Hint: you can think of a structure of two dimensions: 
 * one to store words and one to store their occurences
 */
package homeworks;

import java.util.StringTokenizer;


public class WordCountStatistics {
    public static void main(String []args){
        
        String mostFrequentWord=null;
        String lessFrequentWord=null;
        int totalNumberofWord = 0;
        int numberOfOccurenceOfMostFrequentWord = 0;
        int numberOfOccurenceOfLessFrequentWord = 0;
        String delimiters = " \t,;.?!-:@[](){}_*/";
        
        /** DO YOU WORK HERE **/
        
        
        /** DISPLAY RESULTS **/
        System.out.printf("the most frequent word is %s with %d occurrences\n", 
                mostFrequentWord, numberOfOccurenceOfMostFrequentWord);
        System.out.printf("the less frequent word is %s with %d occurrences\n",
        lessFrequentWord, numberOfOccurenceOfLessFrequentWord);
        System.out.printf("the total number of words is %d\n",
                totalNumberofWord);
        
    }
    
}
