
package topic06.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class ListsTest {
    
    public static void main(String []args) throws Exception{
        List<String> colorArrayList = new ArrayList<String>();
        List<String> colorLinkedList = new LinkedList<String>();
        
        List<Integer> intArrayList = new ArrayList<Integer>();
        List<Integer> intLinkedList = new LinkedList<Integer>();
        
        Set <String> colorHashSet = new HashSet<String>();
        Set <String> colorTreeSet = new TreeSet<String>();
        
        colorArrayList.add("BLUE");
        colorArrayList.add("WHITE");
        colorArrayList.add("RED");
        colorArrayList.add("BLACK");
        colorArrayList.add("ORANGE");
        colorArrayList.add("YELLOW");
        colorArrayList.add("BLUE");
        colorArrayList.add("WHITE");
        colorArrayList.add("RED");
        
        colorLinkedList.add("GREEN");
        colorLinkedList.addAll(colorArrayList);
        
        colorHashSet.addAll(colorLinkedList);
        colorTreeSet.addAll(colorLinkedList);
        
        for (int i=0; i<colorArrayList.size();i++){
            //System.out.println(colorArrayList.get(i));
        }
        System.out.println("");
        for (int i=0; i<colorArrayList.size();i++){
            //System.out.println(colorLinkedList.get(i));
        }
        /*
        System.out.println("");
        for (int i=0; i<colorSet.size();i++){
            System.out.println(colorSet.get(i));
        }
                */
        //System.out.println(colorLinkedList);      
        //System.out.println(colorSet);
          //print(colorArrayList);
          //print(colorLinkedList);
          
          intArrayList.add(1);
          intArrayList.add(2);
          intArrayList.add(3);
          intArrayList.add(4);
          intArrayList.add(5);
          intLinkedList.addAll(intArrayList);
          
          print(colorLinkedList);
          print(colorArrayList);
          print(intArrayList);
          print(intLinkedList);
          
          printReverse(colorLinkedList);
          printReverse(colorArrayList);
          printReverse(intArrayList);
          printReverse(intLinkedList);
          
          
          print(colorHashSet);
          print(colorTreeSet);
          
          printReverse(colorHashSet);
          printReverse(colorTreeSet);
          
    }
    
    public static <T> void print(Collection<T> collection){
        /*
        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        */
        Iterator <T> it = collection.iterator();
        while (it.hasNext()){
            T t = it.next();
            System.out.print(t + " ");
        }
        System.out.println("");
        
    }
    
    public static <T> void printReverse(Collection<T> collection){
        /*
        for (int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        */
        List list;
        if (collection instanceof Set){
            list = new LinkedList<T> ();
            list.addAll(collection);
        }else if (collection instanceof List){
            //downcasting
            list = (List)collection;
        }else
            throw new IllegalArgumentException("Collection must be either a List or a Set");
        
        ListIterator <T> it = list.listIterator(collection.size());
        while (it.hasPrevious()){
            T t = it.previous();
            System.out.print(t + " ");
        }
        System.out.println("");
        
    }
    
    
    
    
    
    
}



/*

public static <T> void print(Collection<T> list){
        
       
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        Iterator <T> it = list.iterator();
        while(it.hasNext()){
            T t = it.next();
            System.out.print(t+" ");
        }
        System.out.println("");
    }
    
    public static <T> void printReverse(Collection<T> collection){
        
        
        for (int i = list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        
        List <T> list;
        if (collection instanceof Set){
            list = new LinkedList<T>();
            list.addAll(collection);
        }else{
           list = (List)collection; 
        }
        
        ListIterator <T> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            T t = it.previous();
            System.out.print(t+" ");
        } 
        System.out.println("");
    }
*/