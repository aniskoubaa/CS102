package exams.quizzes.spring2016.quiz3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeMap <K extends Comparable<K>,V> implements Map <K,V>{
    
    private Set<K> keys;
    private Collection<V> values;
    
    public TreeMap (){
        keys = new TreeSet<K>();
        values = new ArrayList<V>();
    }
    
    public int indexOf(K key){
        int c = 0;
        Iterator <K> it = keys.iterator();
        while (it.hasNext()){
            K k = it.next();
            if (k.equals(key)){
                return c;
            }
            c++;
        }
        return -1;
    }
    
    public void put(K key, V value){
        
        if (!keys.contains(key)){
            keys.add(key);
            ((ArrayList<V>)(values)).add(indexOf(key), value);// add at the end
        }else{
            keys.add(key);
            ((ArrayList<V>)(values)).set(indexOf(key), value);
        }
        
    }
    public boolean removeKey(K key){
        if (keys.contains(key)){
            int c = indexOf(key);
            keys.remove(key);
            ((ArrayList<V>)(values)).remove(c);
            return true;
        }
        return false;
    }
    public boolean removeValue(V value){
        Iterator<K> itk = keys.iterator();
        Iterator<V> itv = values.iterator();
        if (values.contains(value)){
            while (itv.hasNext()){
                K k = itk.next();
                V v = itv.next();
                if (v.equals(value)){
                    itk.remove();
                    itv.remove();
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean removeValue2(V value){
        Iterator<K> itk = keys.iterator();
        
        while (itk.hasNext()){
            K k = itk.next();
            if (this.get(k).equals(value)){
                keys.remove(k);
                values.remove(value);  
                return true;
            }
        }
        return false;
    }
    
    public boolean removeValue3(V value){
        for (K key :keys){
            if (indexOf(key)==((ArrayList<V>)(values)).indexOf(value)){
                keys.remove(key);
                values.remove(value);
                return true;
            }
            
        }
        return false;
    }
    
    
    public V get(K key){
        return ((ArrayList<V>)(values)).get(indexOf(key));
    }
    public boolean containsKey(K key){
        return keys.contains(key);
    }
    public boolean containsValue(V value){
        return values.contains(value);
        
    }
    public Set<K> keySet(){
        return keys;
    }
    
    public String toString(){
        String s="{";
        Iterator<K> itk = keys.iterator();
        Iterator<V> itv = values.iterator();
        
        while (itk.hasNext()){
            s=s+"\""+itk.next()+"\":"+itv.next()+"\", ";
        }
        s=s+"}";
        return s;
    }
    
    public String toString2(){
        String s="{";
        Iterator<K> itk = keys.iterator();
        
        while (itk.hasNext()){
            K k = itk.next();
            s=s+"\""+k+"\":"+get(k)+"\", ";
        }
        s=s+"}";
        return s;
    }
    
}
