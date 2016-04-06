package exams.previous.quizzes.fall2015.quiz3;

import java.util.ArrayList;
import java.util.Collections;


public class WaitingQueue <T extends Comparable<T> & QueuableObject> 
implements Queuable<T>{
    
    private ArrayList<T> waitingQueue; 

    public WaitingQueue(ArrayList<T> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
    
    public WaitingQueue() {
        this.waitingQueue = new ArrayList<T>();
    }
    
    

    public ArrayList<T> getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(ArrayList<T> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
    
    @Override
    public void enqueue(T o){
        this.waitingQueue.add((T)o);
        //Collections.sort(waitingQueue);
    }
    
    @Override
    public T dequeue(){
       T highestPriorityClient = 
               Collections.max(waitingQueue);
        System.out.println(highestPriorityClient); 
        this.waitingQueue.remove(highestPriorityClient);  
        return highestPriorityClient;

    }
    
    @Override
    public int getSize(){
        return this.waitingQueue.size();
    }
        
    public String toString(){
        return String.format("%s",waitingQueue);
    }
    
}
