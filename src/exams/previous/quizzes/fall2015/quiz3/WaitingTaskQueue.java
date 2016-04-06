/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz3;

import java.util.ArrayList;
import java.util.Collections;


public class WaitingTaskQueue implements Queuable{
  
    private ArrayList<Task> waitingQueue; 

    public WaitingTaskQueue(ArrayList<Task> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }public WaitingTaskQueue() {
        this.waitingQueue = new ArrayList<Task>();
    }
    
    

    public ArrayList<Task> getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(ArrayList<Task> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
    
    @Override
    public void enqueue(Object o){
        if (o instanceof Task)
        this.waitingQueue.add((Task)o);
        
        //Collections.sort(waitingQueue);
    }
    
    @Override
    public Object dequeue(){
       Task highestPriorityClient = 
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
