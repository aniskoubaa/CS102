/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;


/**
 *
 * @author akoubaa
 */
public class Employee extends Person {
    
    private String ID;
    private double salary;
    
    public Employee(String firstName, String lastName, Contact contact, double salary, String id){
        super(firstName, lastName, contact);
        setID(id);        
        setSalary(salary);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s, %.2f SAR", this.getID(), super.toString(), salary);
    }
    
    
    
}
