/*
 1. Write a class Person that represents a record of a person. 
It has:
a. three private attributes 
• fullName, which represent an array with two String elements. The first element is the first name and the second element is the last name. 
b.Date birthDate, it represents the date of birth of the Person. The class Date is same class we used in class. You should reuse it.  
c.Address address, it represents the address of the person. The class Address is defined below in the Appendix.
d.a method toString(), which returns a string representation of the Person class in the following format 
[firstname, last name]: birthdate, “Address”.
Example: 
[Ali Hassan], 12/10/1980, “King Abdullah Road, Riyadh, Saudi Arabia”
e.	a constructor with three arguments that sets the values of instance variables to those passed as parameters. 
f.	a copy constructor. 
g.	a default constructor with no argument where all attributes are set to zero. 
Implement the class Person.  (6 points)
 */
package exams.previous.quizzes.fall2014.quiz1;

/**
 *
 * @author akoubaa
 */
public class Person {
    private String [] fullName = new String [2];
    private Date birthDate;
    private Address address;
    
    public Person(String [] fullName, Date birthDate, Address address){
        setFullName(fullName);
        setBirthDate(birthDate);
        setAddress(address);
    }
    
    public Person(){
        //setFullName(null);
        //setBirthDate(null);
        //setAddress(null);
        //this(null, null, null);
    }
    
    public Person(Person p){
        this(p.fullName, p.birthDate, p.address);
    }
    
    
    public void setFullName(String[] fn){
        if (fn.length==2){
            fullName=fn;
        }else System.out.println("Error");
    }
    
   
    
    public void setBirthDate(Date d){
        //birthDate = d;
        birthDate = new Date(d);
    }
    
    public void setAddress (Address a){
        this.address = a;
    }
    
    public Address getAddress(){
        return address;
    }
    
    public String []getFullName(){
        return fullName;
    }
    
    public Date getBirthDate(){
        return birthDate;
    }
    
    public String toString(){
        //[firstname, last name]: birthdate, “Address”.
        return String.format("[%s, %s]: %s %d, %s %s, %s, ", 
                fullName[0], fullName[1],
                getBirthDate(), 
                this.getAddress().getStreetName().number,
                this.getAddress().getStreetName().name,
                this.getAddress().getStreetName().quarter,
                this.getAddress().getCity(),
                this.getAddress().getCountry());
    }
    
    
}
