
package exams.previous.quizzes.fall2015.quiz2;

import java.util.ArrayList;


public class Employee extends Person {
    
    private String id;
    private Department department;
    private double baseSalary;

    public static final ArrayList<Department> DEPARTMENTS = 
            new ArrayList<Department>(); 

    public Employee(String firstName, String lastName, 
            Contact contact, String id, Department department, 
            double baseSalary){
        super(firstName, lastName, contact);
        setDepartment(department);
        setBaseSalary(baseSalary);
        setId(id);
        
        DEPARTMENTS.add(new Department("HR", "01"));
        DEPARTMENTS.add(new Department("Finance", "02"));
        DEPARTMENTS.add(new Department("Public Relations", "03"));
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        for (Department d: DEPARTMENTS){
            if (d.getId().equals(department.getId()))
                this.department = department;
            return; //goes out of the method itself
            //break; //goes out of the for loop
        }
        
    }

    public double getBaseSlary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public String toString(){
        return String.format("%s\nemployee id: %s\ndepartment: %s\n"
                + "salary:%.2f", 
                super.toString(), this.getId(),
                this.getDepartment(), this.getBaseSlary());
    }
    
    
    
    
}
