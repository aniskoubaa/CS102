package exams.previous.quizzes.fall2015.quiz2;

import java.util.ArrayList;

public class CompanyTest {
    public static void main(String[]args){
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
                
        Contact contact1 = new Contact (new Address(new Street(10, "Olya", "Morsalat"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47896511"), new Phone("966", "011", "49173511"));
        Contact contact2 = new Contact (new Address(new Street(20, "Sfax", "Izdihar"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47898711"), new Phone("966", "011", "4774131"));
        
        Department hr = new Department ("HR", "01");
        Department fn = new Department ("Finance", "02");
        Department pr = new Department ("Public Relations", "03");
        
        /**TODO: add employees to the employees list**/
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        
        System.out.println("Printing Empoloyees:\n "+ employees);


        System.out.println("Promote Ahmed Ali to be Manager");
        
        /**TODO: create a manager based on Employee Ali Ahmed. Add Employee of the    
                 same department to his employees list**/        
        
        Manager manager;
        
        System.out.println("Manager: "+ manager);
        
        
    }
