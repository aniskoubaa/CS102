
package topic06.jcf;


import java.util.*;

public class TestPerformance {
    
    public static void main (String [] args){
        
        List <String> arrayList = new ArrayList <String>();
        List <String> linkedList = new LinkedList <String>();
        
        int numberOfElement=90000;
        
        long t0= System.currentTimeMillis();
        for (int i=0; i<numberOfElement; i++){
            arrayList.add("x="+i);
        }
        long t1=System.currentTimeMillis();
        System.out.println("duration ArrayList Add: "+ (t1-t0));
        
        
        
        t0= System.currentTimeMillis();
        
        for (int i=0; i<numberOfElement; i++){
            linkedList.add("x="+i);
        }
        System.out.println("duration LinkedList Add: "+ (System.currentTimeMillis()-t0));
        
        
        
        
        t0= System.currentTimeMillis();
        System.out.println(" ");
        
        for (int i=0; i<numberOfElement; i++){
            arrayList.add(0,"x="+i);
        }
        
        System.out.println("duration ArrayList Add Head: "+ (System.currentTimeMillis()-t0));
        t0= System.currentTimeMillis();
        
        for (int i=0; i<numberOfElement; i++){
            linkedList.add(0,"x="+i);
        }
        
        
        System.out.println("duration LinkedList Add Head: "+ (System.currentTimeMillis()-t0));
        
        
         
        
        t0= System.currentTimeMillis();
         int i=0;
        while (i<arrayList.size()){
            String st = arrayList.get(i);
             //arrayList.set(i, st);    
             i++;
         }
        System.out.println("arrayList.size()= "+linkedList.size());
        System.out.println("duration arrayList get(i): "+ (System.currentTimeMillis()-t0));
   
        
        
        
        
        
        
        t0= System.currentTimeMillis();
         i=0;
        while (i<linkedList.size()){
            //String st = linkedList.get(i);
             //linkedList.set(i, st);    
             i++;
         }
        System.out.println("linkedList.size()= "+linkedList.size());
        System.out.println("duration linkedList get(i): "+ (System.currentTimeMillis()-t0));
   
        
        
        
        System.out.println(" ");
        t0= System.currentTimeMillis();
        
        
        
        ListIterator <String> arrayIterator = arrayList.listIterator();
        
        while (arrayIterator.hasNext()){
            String st = arrayIterator.next();
             arrayIterator.set(st+".");
                    
         }
        System.out.println("duration ArrayList Iterator: "+ (System.currentTimeMillis()-t0));
        
        
        
        
        
        long currentTime= System.currentTimeMillis();
        ListIterator <String> linkedIterator = linkedList.listIterator();
        
        while (linkedIterator.hasNext()){
            String st = linkedIterator.next();
             linkedIterator.set(st+".");
                    
         }
        System.out.println(" ");
        System.out.println("duration LinkedList Iterator: "+ (System.currentTimeMillis()-currentTime));
             //currentTime= System.currentTimeMillis();
         
    }
    
}

