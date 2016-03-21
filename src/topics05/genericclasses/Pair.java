
package topics05.genericclasses;


public class Pair <T extends Comparable <T>>{
    
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public Pair() {
        this.first = null;
        this.second = null;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    
    public String toString(){
        return String.format("(%s, %s)", first, second);
    }
    
}
