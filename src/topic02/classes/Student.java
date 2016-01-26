/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.classes;



/* define the class Student*/
public class Student {
    
    /* define the attributes or instance variables of  the class */
    String firstName;
    String lastName;
    String phone;
    double gpa;
    String address;
    
    
    /*
     * 1- it has the same name of the class
     * 2- Does not have a return type. It does not return anything - not even a void. 
     * 3- it must be declared as public
     */
    
    /* default constructor */
    public Student(){
        
    }
    
    public Student(String fn, String ln, String ph, double GPA, String addr){
        firstName = fn;
        lastName = ln;
        phone = ph;
        gpa = GPA;
        address = addr;
        
    }
    
    public void printInfo(){
       System.out.println("Student Info: ");
        System.out.println("First Name = "+firstName);
        System.out.println("Last Name  = "+lastName);
        System.out.println("Phone      = "+phone);
        System.out.println("GPA = "+gpa);
        System.out.println("Address = "+address);
        System.out.println("");
    }
    
    public void printGPA(){
        System.out.println("gpa       : "+gpa);
        System.out.println("");
    }
    
    
}
