/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.quiz2;


public class HospitalEmployee extends Person{
    
    private String employeeID;
    
    
    public HospitalEmployee(String firstName, 
            String lastName, 
            Contact contact, 
            String employeeID){
        super(firstName, lastName, contact);
        setEmployeeID(employeeID);
    }
    
    /*
    public HospitalEmployee(String firstName, 
            String lastName, 
            Contact contact
            ){
        super(firstName, lastName, contact);
        
    }
    */

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if ((employeeID.startsWith("EM"))&&(employeeID.length()==10))
            this.employeeID = employeeID;
        else
             throw new IllegalArgumentException("invalid employee ID");
    }
    
    public String toString(){
        return String.format("%s %s",
                this.getEmployeeID(),
                super.toString());
    }
    
    
}
