package exams.quizzes.spring2016.quiz3;

import java.util.Set;


public interface Map <K, V>{
    
    public abstract void put(K key, V value);
    public abstract boolean removeKey(K key);
    public abstract boolean removeValue(V value);
    public abstract V get(K key);
    public abstract boolean containsKey(K key);
    public abstract boolean containsValue(V value);
    public abstract Set<K> keySet();
    
}
