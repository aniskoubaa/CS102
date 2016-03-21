
package topics05.genericclasses;


public class KeyValuePair <K extends Comparable <K>,V> {
    
    private K key;
    private V value;   

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public KeyValuePair() {
        this.key = null;
        this.value = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
    public String toString(){
        return String.format("(%s:%s)", key, value);
    }
    
}
