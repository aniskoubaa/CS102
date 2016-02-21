/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.polymorphism.employees;

/**
 *
 * @author akoubaa
 */
public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double weeklySalary) {
        super(first, last, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earning(){
        return this.getWeeklySalary();
    }
    
    public String toString(){
        return String.format("%s\nweekly salary: %.2f", 
                super.toString(), this.getWeeklySalary());
    }
    
}
