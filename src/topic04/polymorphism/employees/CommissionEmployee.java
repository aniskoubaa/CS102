package topic04.polymorphism.employees;

class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate ){
        super(first, last, ssn);
        setGrossSales(sales); //we have to perform data validation
        setCommissionRate(rate);//we have to perform data validation
    }
    
    
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setGrossSales(double sales){
        if (sales>=0.0)//data validation
            grossSales = sales;
        else
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public void setCommissionRate(double rate){
        if ((rate>=0.0)&&(rate<1.0))
            commissionRate = rate;
        else
            throw new IllegalArgumentException("Commission rate must in >=0.0 and <1.0");
    }
    
    public double earning(){
        return this.commissionRate*this.grossSales;
    }
    
    @Override
    public String toString(){
        return String.format("commission %s" 
                + "gross sales: %.2f \n"
                + "commission rate: %.2f", super.toString(), 
                grossSales, commissionRate);
    }
    
}
