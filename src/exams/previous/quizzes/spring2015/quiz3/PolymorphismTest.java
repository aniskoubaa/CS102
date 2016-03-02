package exams.previous.quizzes.spring2015.quiz3;
import java.util.ArrayList;

public class PolymorphismTest {
    public static void main(String []args){
        
        
        ArrayList<Patient> patients_list = new ArrayList<Patient>();
        ArrayList<Doctor> doctors_list = new ArrayList<Doctor>();
        
        
       Contact contact_p1 = new Contact (new Address(new Street(10, "Olya", "Morsalat"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47896511"), new Phone("966", "011", "49173511"));
       Contact contact_d1 = new Contact (new Address(new Street(20, "Sfax", "Izdihar"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47898711"), new Phone("966", "011", "4774131"));
        
        
        Patient p1 = new Patient("Mohamed", "Ahmed", contact_p1, new ArrayList<MedicalReport>(),"PA12345678", new Date (1,1,1970));
        Doctor d1 = new Doctor("General", "EM1245785D", "Ahmed", "Nassir", contact_d1);
        Doctor d2 = new Doctor("Internal Medicine", "EM1291754D", "Mohamed", "Ali", contact_d1);
        MedicalReport m1 = new MedicalReport("High Temperature", d1, new Date(1,4,2015), new Time(17,24,04));
        MedicalReport m2 = new MedicalReport("High Blood Pressure", d2, new Date(1,4,2015), new Time(17,24,04));
        MedicalReport m3 = new MedicalReport("High Sodium Level", d2, new Date(1,4,2015), new Time(17,24,04));
       
        
        
        patients_list.add(p1);
        doctors_list.add(d1);
        
        Hospital hospital = new Hospital();
        
         /***************************************************
         * Write the code that adds all doctors, patients, and 
         * medical report to the printableObjects attribute of 
         * the object hospital.
         ***************************************************/ 
        hospital.printableObjects.add(p1);
        hospital.printableObjects.add(d1);
        hospital.printableObjects.add(d2);
        hospital.printableObjects.add(m1);
        hospital.printableObjects.add(m2);
        hospital.printableObjects.add(m3);
        
        
	/***************************************************/
	/* Write the code that display in JSON format all printable objects added above */
	/***************************************************/
     
        for (Printable p: hospital.printableObjects){
            System.out.println(p.printJson());
        }
        System.out.println("Reports for EM1245785D");
        hospital.printDoctorReport("EM1245785D");
        System.out.println("\nReports for EM1291754D");
        hospital.printDoctorReport("EM1291754D");

        
    }
    
}
