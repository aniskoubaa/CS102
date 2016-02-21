package topic04.polymorphism.employees;



public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary; //base salary per week 
    
    public BasePlusCommissionEmployee (String first, String last, 
            String ssn, double sales, double rate, 
            double salary){
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }
    
    
    public void setBaseSalary(double salary){
        if (salary>=0)
            baseSalary = salary;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override
    public double earning(){
        return baseSalary+(super.earning());
    }
    
    @Override
    public String toString(){
        return String.format("base plus %s\n" 
                + "base salary: %.2f",
                super.toString(), baseSalary);
    }
    
}
