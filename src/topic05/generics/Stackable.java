
package topic05.generics;


public interface Stackable <T>{
    public abstract void push(T e);
    public abstract T pop();
    public abstract boolean isEmpty();
    public abstract void print();
}
