/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.quiz2;

/**
 *
 * @author akoubaa
 */
public class MedicalReport {
    
    private String content;
    private String department;

    public MedicalReport(String report, String department) {
        this.content = report;
        this.department = department;
    }
    
    public String getReport() {
        return content;
    }

    public void setReport(String report) {
        this.content = report;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}
