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
        
         /************ DO YOU WORK HERE **********/
        //declare a scanner object to read the file
        Scanner input=null;
        //create an ArrayList to store the list of words
        ArrayList<String> wordList = new ArrayList<String>();
        //create an ArrayList to store the list of number of occurences for the words
        ArrayList<Integer> countList = new ArrayList<Integer>();
        try {
            input = new Scanner(new File("files/words.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Error with opening the file");
        }
        
        //repeat reading line by line until the end of file
        while(input.hasNextLine()){
            //read the current line
            String line = input.nextLine();
            //System.out.println(line);
            //extract words from the line
            StringTokenizer st = new StringTokenizer(line, delimiters);
            //st contains the list of words.
            //for example is line = "Mohamed_/\-Ali;Yes"
            //st will contain three words: Mohamed Ali Yes
            //if st has more words (it will go through all the words)
            while (st.hasMoreTokens()){
                //read the word and make it to lowercase
                String word = st.nextToken().toLowerCase();
                //System.out.println(word);
                //System.out.println(st.nextElement());
                //if if the list does not contain the word then 
                //    add the word in the wordList list
                //    add the count in the countList list
                //NOTE: the index of the word in the wordList corresponds to the 
                //index of number of occurences in the countList
                if (!wordList.contains(word)){
                    wordList.add(word); //add the word in the wordList list
                    countList.add(1);   //add the count in the countList list
                }else{ //if the word exits
                    //get the index of the word in the wordList
                    int index = wordList.indexOf(word);
                    //increment the count of this word in the countList
                    //Note that the index of the word in wordList is the same as the 
                    //index of its occurrence in countList
                    int currentCount = countList.get(index);
                    countList.set(index, currentCount+1);
                }                
            }            
        }
        
        //the number of most repeating word is the max value in counList
        //you can define your own max function
        //but easier is to use Collections.max(List) which returns the max value of a list
        numberOfOccurenceOfMostFrequentWord = Collections.max(countList);
        //then, we get the index of this max value in the countList
        int i = countList.indexOf(numberOfOccurenceOfMostFrequentWord);
        //we use this index to find the most frequent word
        //this is because the index of the most frequent work is the same index as
        //the maximum value in count list
        mostFrequentWord = wordList.get(i);
        
        /** we do the same for min **/
        
        //the number of least repeating word is the min value in counList
        //you can define your own min function
        //but easier is to use Collections.min(List) which returns the min value of a list
        numberOfOccurenceOfLessFrequentWord = Collections.min(countList);
        //then, we get the index of this min value in the countList
        i = countList.indexOf(numberOfOccurenceOfLessFrequentWord);
        //we use this index to find the least frequent word
        //this is because the index of the least frequent work is the same index as
        //the minimum value in count list
        lessFrequentWord = wordList.get(i);
        
        //the total number of words is just the size of the wordList        
        totalNumberofWord = wordList.size();
        
        /** DISPLAY RESULTS **/
        System.out.printf("the most frequent word is [%s] with [%d] occurrences\n", 
                mostFrequentWord, numberOfOccurenceOfMostFrequentWord);
        System.out.printf("the less frequent word is %s with %d occurrences\n",
        lessFrequentWord, numberOfOccurenceOfLessFrequentWord);
        System.out.printf("the total number of words is %d\n",
                totalNumberofWord);
        
        
        //the idea here is: we use the same steps as abobe to find the 
        //numberOfOccurenceOfMostFrequentWord and mostFrequentWord
        //then, we remove that word from the list
        //we repeat the process 10 times.
        
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
