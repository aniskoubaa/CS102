package topic04.polymorphism.interfaces;


public class SalariedEmployee extends Employee  {
    
    private double weeklySalary;
    
    public SalariedEmployee (String first, String last, String ssn, double salary){
        super(first, last,ssn);
        setWeeklySalary(salary);
    }
    
    //set Salary
    public void setWeeklySalary(double salary){
        if (salary>=0.0)
            weeklySalary=salary;
        else
            weeklySalary=0.0;
    }
    
    //get Salary
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    //calculate earnings methods for salaried employee
    @Override
    public double getPayment(){
        return getWeeklySalary();
    }
    
    @Override 
    public String toString(){
        return 
           String.format("salaried employee: %s\nweekly salary: %.2f, payment: %.2f", 
           super.toString(),getWeeklySalary(), getPayment());
    }
    
    
}
