package exams.previous.quizzes.spring2015.quiz3;
import java.util.ArrayList;


public class Hospital {
    
    ArrayList <Employee> doctors = new ArrayList<Employee>();
    ArrayList <Patient> patients = new ArrayList<Patient>();
    ArrayList <MedicalReport> reports = new ArrayList<MedicalReport>();
    ArrayList <Printable> printableObjects = new ArrayList<Printable>();
    
    public void printDoctorReport (String DrID){
        
        for (Printable p : printableObjects){
            if (p instanceof MedicalReport){
               MedicalReport m = (MedicalReport)p;
               if (m.getDoctor().getEmployeeID().equals(DrID))
                System.out.println(p.printText());
            }
        }
        
    }
    
    
        
   
    
    
}
