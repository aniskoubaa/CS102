/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack <T> implements Stackable <T>{
    
    private ArrayList<T> elements ;
    
    public Stack(){
        //this(0);
        elements = new ArrayList<T>();
    }
    
    public Stack(int capacity){
        elements = new ArrayList<T>(capacity);
    }
    
    public void push(T e ){
        elements.add(e);
    }
    
    public T pop() {
        if (!elements.isEmpty()){
            //throw new Exception("Stack is empty");
            int index = elements.size()-1;
            return elements.remove(index);
        }
        return null;
    }
    
    public void print(){
         System.out.println("stack");
        for (int i=this.elements.size()-1; i>=0;i--){
            System.out.println(elements.get(i));
        }
        System.out.println("\n");
    }
    
    public boolean isEmpty(){
        return elements.size()==0;
    }
    
}
