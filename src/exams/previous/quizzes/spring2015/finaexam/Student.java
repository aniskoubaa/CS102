/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;


import exams.previous.quizzes.spring2015.finaexam.Person;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Student extends Person{
    
    private String studentID;
    private Set<String> courses = new TreeSet<String>();

    public Student(String firstName, String lastName, Contact contact, String id) {
        super(firstName, lastName, contact);
        setStudentID(id);
    }
      
    public void enroll (String courseID){
        courses.add(courseID);
    }
    
    public void withdraw (String courseID){
        courses.remove(courseID);
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String ID) {
        this.studentID = "STU"+ID;
    }
    
    
    
    public String toString(){
        return String.format("%senrolled in: %s\n\n", super.toString(), courses);
    }

}
