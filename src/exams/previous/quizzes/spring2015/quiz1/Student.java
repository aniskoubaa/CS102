/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.quiz1;

/**
 *
 * @author akoubaa
 */
public class Student {
    
    private String fullName;
    private Address address;
    private Date birthDate; //must be between 01/01/1987 and 30/12/1980

    public Student(String fullName, Address address, Date birthDate) { this.fullName = fullName;
        setAddress(address);
        setBirthDate(birthDate);
        setFullName(fullName);
    }
    
    public Student (Student st){
        this(st.getFullName(), st.getAddress(), st.getBirthDate());
    }
    public String getFullName() { 
        return fullName;
    }
    public Address getAddress() { 
        return address;
    }
    public Date getBirthDate() {    
        return birthDate;
    }
    
    public void setFullName(String fullName) { 
        this.fullName = fullName;
    }
    
    public void setAddress(Address address) { 
        this.address = address;
    }
    
    public void setBirthDate(Date birthDate) { 
        
        this.birthDate = birthDate;// add data validation
    }
    
    public String toString (){
        return String.format("%s (%s)", this.fullName, this.birthDate);
    }
}
