package exams.previous.quizzes.fall2015.quiz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class WaitingClientQueue implements Queuable{
    
    private ArrayList<Client> waitingQueue; 

    public WaitingClientQueue(ArrayList<Client> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }public WaitingClientQueue() {
        this.waitingQueue = new ArrayList<Client>();
    }
    
    

    public ArrayList<Client> getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(ArrayList<Client> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
    
    @Override
    public void enqueue(Object o){
        if (o instanceof Client)
        this.waitingQueue.add((Client)o);
        //Collections.sort(waitingQueue);
    }
    
    @Override
    public Object dequeue(){
       Client highestPriorityClient = 
               Collections.max(waitingQueue);
        System.out.println(highestPriorityClient); 
       return this.waitingQueue.remove(highestPriorityClient);  

    }
    
    @Override
    public int getSize(){
        return this.waitingQueue.size();
    }
        
    public String toString(){
        return String.format("%s",waitingQueue);
    }
}
