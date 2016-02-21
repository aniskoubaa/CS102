
package exams.previous.quizzes.fall2015.quiz2;

import java.util.ArrayList;


public class Manager extends Employee{
    
    public static final String [] MANAGER_TYPE 
            = {"SENIOR MANAGER", "LOCAL MANAGER"};
    
    private double salaryIncrement;
    private String type;
    private ArrayList<Employee> employees;

    public Manager(String firstName, String lastName, Contact contact, 
            String id, Department department, 
            double baseSalary, double salaryIncrement, 
            String type, ArrayList<Employee> employees) {
        super(firstName, lastName, contact, id, department, baseSalary);
        setSalaryIncrement(salaryIncrement);
        setType(type);
        setEmployees(employees);
    }
    public Manager(Employee e, double salaryIncrement, 
            String type, ArrayList<Employee> employees){
        /*super(e.getFirstName(), e.getLastName(), 
                e.getContact(), e.getId(), e.getDepartment(), 
                e.getBaseSlary());
        
        setSalaryIncrement(salaryIncrement);
        setType(type);
        setEmployees(employees);*/
        this(e.getFirstName(), e.getLastName(), 
                e.getContact(), e.getId(), e.getDepartment(), 
                e.getBaseSlary(), 
                salaryIncrement,
                type,  
                employees);
    }
    
    public Manager(Manager m){
        this(m.getFirstName(), m.getLastName(), 
                m.getContact(), m.getId(), m.getDepartment(), 
                m.getBaseSlary(), 
                m.salaryIncrement,
                m.type,  
                m.employees);
    }

    public double getSalaryIncrement() {
        return salaryIncrement;
    }

    public void setSalaryIncrement(double salaryIncrement) {
        boolean condition1= (type.equals(MANAGER_TYPE[0]))&&
                (salaryIncrement<0.9)&&(salaryIncrement>0.5);
        boolean condition2= (type.equals(MANAGER_TYPE[1]))&&
                (salaryIncrement<0.49)&&(salaryIncrement>0.1);
        
        if (condition1 || condition2)
            this.salaryIncrement = salaryIncrement;
        else
            throw new IllegalArgumentException ("invalid increment");
    }
        
        


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    
    public double getSalary(){
        return this.getBaseSlary()*(1+this.getSalaryIncrement());
    }
    
    
    
    
}
