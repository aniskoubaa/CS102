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
public class Staff extends Employee{
    
    private Department department;
    private String jobTitle;

    public Staff(String firstName, String lastName, Contact contact, double salary, String id, Department department, String jobTitle) {
        super(firstName, lastName, contact, salary, id);
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    @Override
    public void setID(String idNumber){
        super.setID("STAFF"+idNumber);
    }
    
    public String toString(){
        return String.format("%s\nwork as: %s\n\n", super.toString(), jobTitle);
    }
    
}
