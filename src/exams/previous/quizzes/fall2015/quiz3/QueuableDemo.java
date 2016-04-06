package exams.previous.quizzes.fall2015.quiz3;

import java.util.ArrayList;

public class QueuableDemo {
    public static void main(String[]args){
        
        
        
       ArrayList<QueuableObject> qlist = new ArrayList<QueuableObject>();
        Client c = new Client(350, "Normal", "Mohamed", "Ali");
        Task t = new Task("Task2", 22, 1);
       /**: add all QueuableObject objects to the qlist **/
        qlist.add(new Client(350, "Normal", "Mohamed", "Ali"));
        qlist.add(new Client(353, "VIP", "Salah", "Raed"));
        qlist.add(new Task("Task2", 22, 1));
        qlist.add(new Client(352, "Normal", "Mounir", "Hassan"));
        qlist.add(new Task("Task3", 23, 2));
        qlist.add(new Client(357, "VIP", "Shahed", "Boudhir"));
        qlist.add(new Task("Task1", 21, 3));
        
        /**1: enqueue all Client objects in the WaitingClientQueue q**/
        Queuable <Client> qc ;
            qc = new WaitingQueue<Client>();
            
        Queuable <Task> qt ;
            qt = new WaitingQueue<Task>();
            
       //Queuable <String> qs ;
        //    qs = new WaitingQueue<String>();
            
        //List <String> qs = new ArrayList<String>();    
        //q.enqueue(t);
        //q.enqueue("CS102");
        //System.out.println(q);
       //q.enqueue(c);
       //System.out.println(q);
       //System.out.println(q.getSize());
       //WaitingClientQueue q2 = (WaitingClientQueue)q;
       for (QueuableObject x : qlist){
           if (x instanceof Client)
            qc.enqueue((Client)x);
           else if (x instanceof Task){
               qt.enqueue((Task) x);
           }
       }
        System.out.println(qc);
        System.out.println(qc.getSize());
       // System.out.println(q.getWaitingQueue().size());
       /** 2: print the size of the WaitingClientQueue **/
        WaitingClientQueue q2 = (WaitingClientQueue)qc;
        System.out.println(q2.getWaitingQueue().size());
        
        
       //System.out.println(q.getSize());
        /** 3: dequeue all the Client from the queue **/
        int size = qc.getSize();
        for (int i=0; i<size;i++){
            qc.dequeue();
        }
        
       
    }
    
}
