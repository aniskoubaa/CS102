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
public class Course {
    
    private String courseID;
    private String title;
    private Department department;
    private int creditHours;

    public Course(String courseID, String title, Department department, int creditHours) {
        this.courseID = courseID;
        this.title = title;
        this.department = department;
        this.creditHours = creditHours;
    }
    
    public boolean equals (Course C){
        return (C.getCourseID().equals(courseID));
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    public String toString(){
        return String.format("{%s. %s, %s, %d}\n", courseID, title, department, creditHours);
    }
    
    
    
    
}
