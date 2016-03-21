package topic05.generics;

import topic05.generics.*;

public class Student implements Comparable<Student>{
    
    //attributes of the class students
    private String firstName;
    private String lastName;
    private String id;
    private String mobilePhone;
    private static int count;
    
    private final int max_age = 40;
    
    public Student(){
        count++;
    }
    
    public Student (String fn, String ln, String ID, String mp){
       /*firstName = fn;
       lastName = ln;
       id = ID;*/
        
       this.setFirstName(fn);
       setLastName(ln);
       setId(ID);
       /*if (mp.length()==10)
       mobilePhone=mp;*/
       setMobilePhone(mp);
       count++;
    }
    
    public Student (String fn, String ln){

       this.setFirstName(fn);
       setLastName(ln);
       count++;
    }
    
    public static int getCount(){
        return count;
    }
    
    public String getMobilePhone(){
        return mobilePhone;
    }
    
    public void setMobilePhone(String mp){
        if (mp.length()==10)
        mobilePhone = mp;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getId(){
        return id;
    }
    
    public void setFirstName(String fn){
        if (fn.length()>2)
        firstName=fn;
    }
    
    public void setLastName(String ln){
        if (ln.length()>2)
        this.lastName=ln;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    
    //methods
    public void displayStudentInfo(){
        System.out.printf("%s %s (%s) {%s}\n", firstName, 
                lastName, id, mobilePhone);  
    }
    
    public void displayName(){
        System.out.printf("%s %s \n", firstName, 
                lastName);  
    }
    
    public String toString(){
        return String.format("[%s] %s %s (%s)",id,  firstName, lastName, 
                this.mobilePhone);
    }

  
    public int compareTo(Student s) {
        return this.id.compareTo(s.id);
    }
        

}
