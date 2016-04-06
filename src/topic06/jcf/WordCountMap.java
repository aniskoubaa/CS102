package topic06.jcf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCountMap {

    static Map <String, Integer> wordMap = 
            new HashMap<String, Integer>();
    
    static String str = "This is CS102 course. This course is very interesting.";
    
    public static void main(String []args){
        System.out.println(str);
        countWords(str);
        printStats(wordMap);
        
    }
    
    public static void countWords (String s){
        String delimiters = " \t,;.?!-:@[](){}_*/";
        StringTokenizer words = new StringTokenizer(str, delimiters);

        while (words.hasMoreTokens()){
            String word = words.nextToken().toLowerCase();
            if (!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            }else{
                wordMap.put(word, wordMap.get(word)+1);
            }
        }
    }
    
    public static void printStats (Map <String, Integer> map){
        
        //first, extract the keys
        Set<String> keys = map.keySet();
        Iterator <String> it = keys.iterator();
        System.out.printf("%-20s %-10s\n", "word", "count");
        while (it.hasNext()){
            String word = it.next();
            Integer count = map.get(word);
            System.out.printf("%-20s %-10s\n", word, count);
            
        }
        System.out.println("");        
    }
    
    
}
