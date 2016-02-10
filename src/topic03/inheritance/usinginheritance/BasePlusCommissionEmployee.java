package topic03.inheritance.usinginheritance;


public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String first, String last, 
            String ssn, double sales, double rate, 
            double salary){
        super(first,last,ssn,sales,rate);
        setBaseSalary(salary);
        
    }
    
    public void setBaseSalary(double baseSalary){
        if (baseSalary>0.0)
            this.baseSalary=baseSalary;
        else
            this.baseSalary=0.0;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override
    public double earning(){
        //return baseSalary+(getCommissionRate()*this.getGrossSales());
        return baseSalary+super.earning();
    }
    
    @Override
    public String toString(){
        return String.format("base plus %s"
                + "base salary: %.2f",
                super.toString(), baseSalary);
    }
    
}
