package topic03.inheritance.withoutinheritance;

public class BasePlusCommissionEmployee {
    private String firstName;
    private String lastName;
    private String Ssn;
    private double grossSales;
    private double commissionRate;
    
    private double baseSalary; //base salary per week
    
    public BasePlusCommissionEmployee(String first, String last, 
            String ssn, double sales, double rate, 
            double salary){
        firstName = first;
        lastName = last;
        Ssn = ssn;
        setGrossSales(sales); //we have to perform data validation
        setCommissionRate(rate);//we have to perform data validation
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
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String last){
        lastName=last;
    }
    
    public String getSsn(){
        return Ssn;
    }
    
    public void setSsn (String ssn){
        Ssn=ssn;
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setGrossSales(double sales){
        if (sales>=0.0)
            grossSales = sales;
        else
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public void setCommissionRate(double rate){
        if ((rate>=0.0)||(rate<1.0))
            commissionRate = rate;
        else
            throw new IllegalArgumentException("Commission rate must in >=0.0 and <1.0");
    }
    
    public double earning(){
        return baseSalary+(commissionRate*grossSales);
    }
    
    @Override
    public String toString(){
        return String.format("base plus commission employee: %s %s\n"
                + "social security number: %s \n"
                + "gross sales: %.2f \n"
                + "commission rate: %.2f\n" 
                + "base salary: %.2f",
                firstName, lastName, Ssn, 
                grossSales, commissionRate, baseSalary);
    }
    
}
