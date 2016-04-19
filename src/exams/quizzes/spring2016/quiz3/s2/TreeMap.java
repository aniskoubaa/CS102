package exams.quizzes.spring2016.quiz3.s2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeMap<K extends Comparable<K>,V> implements Map<K,V> {

    Set<K> keys;
    Collection<V> values;
    
    public TreeMap(){
        keys = new TreeSet<K>();
        values = new ArrayList<V>();
    }
    
    public int indexOf(K key){
        int index = 0;
        Iterator <K> it = keys.iterator();
        while (it.hasNext()){
            K k = it.next();
            if (key.equals(k))
                return index;
            index++;
        }
        return -1;
    }
    
    public void put(K key, V value){
        if (!keys.contains(key)){
            keys.add(key);
            ((ArrayList<V>)(values)).add(indexOf(key),value);
        }
    }
    public boolean removeKey(K key){
        Iterator <K> itk = keys.iterator();
        Iterator<V> itv = values.iterator();
        
        while(itk.hasNext()){
            K k = itk.next();
            V v = itv.next();
            if (k.equals(key)){
                itk.remove();
                itv.remove();
                return true;
            }
        }
        return false;
    }
    /*
    public boolean removeKey2(K key){
        Iterator <K> itk = keys.iterator();
        
        while(itk.hasNext()){
            K k = itk.next();
            if (k.equals(key)){
                itk.remove();
                values.remove(this.get(key));
                return true;
            }
        }
        return false;
    }
    */
    public boolean removeKey2(K key){
        if (keys.contains(key)){
            int c = indexOf(key);
            keys.remove(key);
            ((ArrayList<V>)(values)).remove(c);
            return true;
        }
        return false;
    }
    /* will result into a conflict
    public boolean removeKey3(K key){
        if (keys.contains(key)){
            values.remove(this.get(key));
            keys.remove(key);
            
        }
    }
    */
    
    
    
    public boolean removeValue(V value){
        Iterator <K> itk = keys.iterator();
        Iterator<V> itv = values.iterator();
        
        while(itk.hasNext()){
            K k = itk.next();
            V v = itv.next();
            if (v.equals(value)){
                itk.remove();
                itv.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean removeValue2(V value){
        Iterator <K> itk = keys.iterator();
        
        while(itk.hasNext()){
            K k = itk.next();
            int index = indexOf(k);
            
            if (((ArrayList<V>)(values)).get(index).equals(value)){
                itk.remove();
                ((ArrayList<V>)(values)).remove(index);
                return true;
            }
        }
        return false;
    }
    
    public boolean removeValue3(V value){
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
    
    public boolean removeValue4(V value){
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
    
    
}
