/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.classes;



/* define the class Student*/
public class Student {
    
    /* define the attributes or instance variables of  the class */
    //access specifier: public or private - by default public
    private String firstName;
    private String lastName;
    private String phone;
    private double gpa;
    private String address;
    
    private static int count =0;
    
    
    /*
     * 1- it has the same name of the class
     * 2- Does not have a return type. It does not return anything - not even a void. 
     * 3- it must be declared as public
     */
    
    /* default constructor */
    public Student(){
       count++;
    }
    
    public Student(String fn, String ln, String ph, double GPA, String addr){
        //firstName = fn;
        //lastName = ln;
        //phone = ph;
        //gpa = GPA;
        //address = addr;
       count++;
        setFirstName(fn);
        setLastName(ln);
        setPhone(ph);
        setGpa(GPA);
        setAddress(addr);
    }
    
    public static int getCount(){
        return count;
    }
    
    public String getPhone(){
        return phone;
    }
    
   
    public void setPhone(String ph){
        //data validation
        if (ph.startsWith("05")&&(ph.length()==10))
            phone = ph;
        else throw new IllegalArgumentException ("Wrong Phone Number");
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }    
    
    public double getGpa(){
        return gpa;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setGpa(double GPA){
        if ((GPA>=0.0)&&(GPA<=4.0)){
            gpa= GPA;
        }
        else{
            System.out.println("GPA value is not valid!");
        }
    }
    
    public void setAddress(String addr){
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
