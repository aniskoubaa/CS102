package exams.previous.quizzes.fall2015.quiz3;

import java.util.ArrayList;

class Client extends Person 
implements QueuableObject, Comparable<Client>{

    private int waitingNumber;
    public String clientPriority;
    
    public String [] clientPriorities={"Normal", "VIP"};
    
    public Client(int waitingNumber, String clientPriority, String firstName, String lastName) {
        super(firstName, lastName);
        this.waitingNumber = waitingNumber;
        this.clientPriority = clientPriority;
    }
    

    public int getWaitingNumber() {
        return waitingNumber;
    }

    public void setWaitingNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }
    
    public int compareTo(Client c){
        if (this.clientPriority!=c.clientPriority){
            //return this.clientPriority.compareTo(c.clientPriority);
            if (this.clientPriority.equalsIgnoreCase("vip"))
                return 1;
            else return -1;
        }
        return -this.waitingNumber+c.waitingNumber;
    }
    
    public String toString(){
        return String.format("%s (%s,%d)", super.toString(), this.clientPriority,this.waitingNumber);
    }
    
    
}
