
package topic04.polymorphism.employees;

import java.util.ArrayList;


public class EmployeeTest {
    public static void main(String [] args){
        
       
        
        
        CommissionEmployee cm = 
                new CommissionEmployee
                        ("Mohamed", "Ali", "333-33-3333", 5000, 0.04);
        
        CommissionEmployee cm2 = 
                new BasePlusCommissionEmployee ("Ahmed", "Mounir", "263-39-3355", 5000, 0.04, 300);
        
        
        //general to the specific
        //from to to down
        //downcasting
        BasePlusCommissionEmployee bpcm=
                (BasePlusCommissionEmployee)cm2;
        
        System.out.println(((BasePlusCommissionEmployee)cm2).getBaseSalary());
        
 
        System.out.println(cm.earning()+"\n");
        System.out.println(cm2.earning());
        
        double x=2.3;
        int y=(int)x;
        
        
        
        
       
        
        //downcasting
        BasePlusCommissionEmployee bpcm2 = (BasePlusCommissionEmployee) cm2;

        
        System.out.println(cm.earning()+"\n");
        System.out.println(cm2);
        System.out.println(bpcm.getBaseSalary());
        
       
        Employee sm = 
                new SalariedEmployee
                        ("Kamel", "Mounr", "263-39-3344",300);
        
        System.out.println("DOWNCASTING CM");
        System.out.println("CommissionEmployee: " +(cm instanceof CommissionEmployee));
        System.out.println("BasePlusCommissionEmployee: " +(cm instanceof BasePlusCommissionEmployee));
        //CommissionEmployee m_cast = (BasePlusCommissionEmployee) cm;
        // System.out.println(cm_cast.getGrossSales());

        //System.out.println(cm+"\n");
        //System.out.println(bpcm);
       
        //int x = 0;
        //double y = (double)x;
        
        //downcasting
        //CommissionEmployee cm_cast = (CommissionEmployee) cm;
        //BasePlusCommissionEmployee bpcm_cast = (BasePlusCommissionEmployee)bpcm;
        
        //System.out.println("\ncm earning: "+cm_cast.earning());
        //System.out.println("bpcm earning: "+bpcm_cast.earning());
        
        
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(cm);
        employees.add(bpcm);
        //employees.add(cm_cast);
        //employees.add(bpcm_cast);
        employees.add(sm);
        
        //polymorphic processing
        for (int i=0; i<employees.size();i++){
            if (employees.get(i) instanceof CommissionEmployee){
                CommissionEmployee cme = (CommissionEmployee)employees.get(i);
                System.out.printf("%.2f\n", cme.earning());
            }else 
                if (employees.get(i) instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee cme = (BasePlusCommissionEmployee)employees.get(i);
                System.out.printf("%.2f\n", cme.earning());
            }
            
            System.out.printf("%.2f\n", employees.get(i).earning());
            if (employees.get(i) instanceof SalariedEmployee){
            //    downcasting
                SalariedEmployee sem = (SalariedEmployee)(employees.get(i));
              System.out.printf("weekly salary: %.2f\n", sem.getWeeklySalary());
                
            }
            
        }
        
        
        
        
        
    }
    
}
