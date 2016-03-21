
package topic05.generics;


public class PairDouble {
    
    Double first;
    Double second;

    public PairDouble(Double first, Double second) {
        this.first = first;
        this.second = second;
    }

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }
    
    public String toString(){
        return String.format("(%s, %s)", first, second);
    }
    
    
}
