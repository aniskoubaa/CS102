package topic06.jcf;

import java.util.PriorityQueue;
import java.util.Stack;


public class StackQueueDemo {

    public static void main(String[]args){
        
     Stack <String> stack = new Stack<String>();
     PriorityQueue <String> queue = new PriorityQueue<String>();
     
     //adding elements
     stack.push("first");
     stack.push("second");
     stack.push("third");
     stack.push("fourth");
     
     queue.offer("first");
     queue.offer("second");
     queue.offer("third");
     queue.offer("fourth");
     
     //process elements
     System.out.println("Processing stack elements");
     while (!stack.isEmpty()){
         System.out.println(stack.pop());
     }
     System.out.println("");
     System.out.println("Processing priority queue elements");
     while (!queue.isEmpty()){
         System.out.print(queue.poll()+" ");
     }
        System.out.println("\n\n");
     
     Stack <Integer> istack = new Stack<Integer>();
     PriorityQueue <Integer> iqueue = new PriorityQueue<Integer>();
     
     //adding elements
     istack.push(5);
     istack.push(3);
     istack.push(10);
     istack.push(4);
     
     iqueue.offer(5);
     iqueue.offer(3);
     iqueue.offer(10);
     iqueue.offer(4);
     
     //process elements
     System.out.println("Processing stack elements");
     while (!istack.isEmpty()){
         System.out.println(istack.pop());
     }
     System.out.println("");
     System.out.println("Processing priority queue elements");
     while (!iqueue.isEmpty()){
         System.out.print(iqueue.poll()+" ");
     }
        System.out.println("");       
    } 
    
    
             
}
