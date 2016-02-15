/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.quiz2;

import java.util.ArrayList;


public class Doctor extends HospitalEmployee{
    
    private static final ArrayList<String> DEPARTMENTS_LIST = new ArrayList<String>();
    //private static final String [] DLIST = {"General","Internal"};

    private String department;
    
    public Doctor(String firstName, 
            String lastName, 
            Contact contact, 
            String employeeID, String department){
        super(firstName, lastName, contact, employeeID);
        DEPARTMENTS_LIST.add("General");
        DEPARTMENTS_LIST.add("Pediatric");
        DEPARTMENTS_LIST.add("Internal Medicine");
        setDepartment(department);
        this.setEmployeeID(employeeID);
    }
    
    @Override
    public void setEmployeeID(String employeeID){
        if (employeeID.endsWith("D"))
            super.setEmployeeID(employeeID);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (DEPARTMENTS_LIST.contains(department))
             this.department = department;
        else
            throw new IllegalArgumentException("invalid department");
    }
    
 

}
