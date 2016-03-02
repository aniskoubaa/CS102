package exams.previous.quizzes.spring2015.quiz3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doctor extends Employee {
    
    public static final ArrayList<String> DEPARTMENTS_LIST = new ArrayList<String>();
    
    private String department;

    public Doctor(String department, String employeeID, String firstName, String lastName, Contact contact) {
        super(employeeID, firstName, lastName, contact);
        DEPARTMENTS_LIST.add("General");
        DEPARTMENTS_LIST.add("Pediatric");
        DEPARTMENTS_LIST.add("Internal Medicine");
        setDepartment(department);
        setEmployeeID(employeeID);
        
    }
    
    @Override
    public String getDescription(){
     return String.format("Dr. %s %s",
             getFirstName(), getLastName());   
    }
    
  

    /*
    Doctor [doctorID]: firstName LastName
    Department: department
    */
    //
    @Override
    public String printText(){
        return String.format("Doctor [%s]: %s %s"
                + "\nDepartment: %s", this.getEmployeeID(),
                this.getFirstName(), this.getLastName(),
                this.getDepartment());
    }
    /*
    {"firstname": "firstName", "lastname": "lastName ", 
    "department":  “department”
    */
    @Override
    public String printJson(){
        return String.format("{\"firstname\": \"%s\","
                + "\"lastname\": \"%s\", "
                + "\"department\":\"%s\"}",
                this.getFirstName(), this.getLastName(),
                this.getDepartment());
    }
    
        
    public void setEmployeeID(String employeeID){
        if (employeeID.endsWith("D"))
            super.setEmployeeID(employeeID);
        else throw new IllegalArgumentException("Doctor ID not correct");
        
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (DEPARTMENTS_LIST.contains(department))
            this.department = department;
        else throw new IllegalArgumentException("Department not correct");
    }
 
}
