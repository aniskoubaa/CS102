/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author akoubaa
 */
public class Instructor extends Employee {
    
    private Department department;
    Set<String> courses = new TreeSet<String>(); //set of Course ID

    public Instructor(String firstName, String lastName, Contact contact, Department department, double salary, String id) {
        super(firstName, lastName, contact, salary, id);
        this.department = department;
    }
    
     @Override
    public void setID(String idNumber){
        super.setID("INST"+idNumber);
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }
    
        
    public int assignCourse(String CourseID){
        courses.add(CourseID);
        return courses.size();
    }
    
    public int unassignCourse(String courseID){
        courses.remove(courseID);
        return courses.size();
    }
    
    public boolean isTeachingCourse (String courseID){
        for (String cid : courses){
            if (courseID.equals(cid))
                    return true;
        }
        return false;
    }
    
    
    public String toString(){
        return String.format("%s\nteaches: %s\n\n", super.toString(), courses);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    
}
