
package exams.previous.quizzes.spring2015.quiz2;

import java.util.ArrayList;


public class Patient extends Person{
    
    private String patientID;
    private ArrayList<MedicalReport> reports;
    
    public Patient(String firstName, 
            String lastName, 
            Contact contact, 
            String patientID,
            ArrayList<MedicalReport> reports){
        super(firstName, lastName, contact);
        setPatientID(patientID);
        setReports(reports);
        
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        if((patientID.startsWith("PA"))&&(patientID.length()==10))
            this.patientID = patientID;
        else
            throw new IllegalArgumentException("invalid patient ID");
    }

    public ArrayList<MedicalReport> getReports() {
        return reports;
    }

    public void setReports(ArrayList<MedicalReport> reports) {
        this.reports = reports;
    }
    
    //[patientID] firstName lastName, contact, report
    public String toString(){
        return String.format("[%s] %s, %s",
                this.getPatientID(),
                super.toString(),
                this.getReports());
    }
    
}
