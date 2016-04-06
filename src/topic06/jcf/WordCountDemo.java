package topic06.jcf;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import static topic06.jcf.WordCountMap.str;


public class WordCountDemo {
    
    private static Map <String, Integer> wordMap = 
            new TreeMap<String, Integer>();
    
    
    private static String str = "This is CS102 Course. This course is very interesting.";
    
    public static void main(String []args){
        
        countWords();
        printMap();
        
    }
    
    public static void countWords(){
        
        String delimiters = " \t,;.?!-:@[](){}_*/";
        StringTokenizer words = new StringTokenizer(str, delimiters);

        
        //String [] words = str.split(" ");
        
        while (words.hasMoreTokens()){
            String word = words.nextToken().toLowerCase();
            if (!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            }else{
                wordMap.put(word, wordMap.get(word)+1);
            }
        }
    }
    
    public static void printMap(){
        
        Set<String> keys = wordMap.keySet();
        Iterator <String> it = keys.iterator();
        System.out.printf("%-15s %-10s\n", "word", "count");
        while (it.hasNext()){
            String word = it.next().toLowerCase();
            Integer count = wordMap.get(word);
            System.out.printf("%-15s %-10s\n", word, count);
        }
        System.out.println("");
    }
    
}
