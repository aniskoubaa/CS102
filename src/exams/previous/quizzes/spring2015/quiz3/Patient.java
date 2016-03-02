package exams.previous.quizzes.spring2015.quiz3;

import java.util.ArrayList;

public class Patient extends Person {
    
    private String patientID;
    private ArrayList<MedicalReport> reports;

    public Patient(String firstName, String lastName, Contact contact, ArrayList<MedicalReport> reports, String patientID, Date date) {
        super(firstName, lastName, contact);
        setPatientID(patientID);
        this.reports = this.reports;
        this.setBirthDate(date);
    }

    //
    @Override
    public String getDescription(){
     return String.format("%s %s is a patient",
             getFirstName(), getLastName());   
    }
    
    //Patient [patientID]: firstName LastName
    //Born: birthDate

    
    @Override
    public String printText(){
        return String.format("Patient [%s]: %s %s"
                + "\nBorn: %s", this.getPatientID(),
                this.getFirstName(), this.getLastName(),
                this.getBirthDate());
    }
    //{"firstname": "firstName", "lastname": "lastName ", 
    //"Date": {"day","month","year"} }
    @Override
    public String printJson(){
        return String.format("{\"firstname\": \"%s\","
                + "\"lastname\": \"%s\", "
                + "\"Date\":{\"%d\",\"%d\",\"%d\"}}",
                this.getFirstName(), this.getLastName(),
                this.getBirthDate().getDay(),
                super.getBirthDate().getMonth(),
                getBirthDate().getYear());
    }
    
    
    public String getPatientID() {
        return patientID;
    }

   public void setPatientID(String patientID){
        if (patientID.startsWith("PA") && patientID.length()==10)
            this.patientID=patientID;
        else throw new IllegalArgumentException("Patient ID not correct");
        
    }
    
    public ArrayList<MedicalReport> getReport() {
        return reports;
    }

    public void setReport(ArrayList<MedicalReport> report) {
        this.reports = report;
    }

    public String toString(){
        return String.format("[%s] %s %s", patientID, super.toString(), reports);
    }
    
}
