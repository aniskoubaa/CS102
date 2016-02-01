/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.classes;

import java.util.ArrayList;

/* Driver or Test Class */
public class StudentTest {
    
    public static void main(String []args){
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        Date birthDate1 = new Date(1,2,1980);
        
        //new Student(): creates a new object in the memory
        Student student1 = new Student("Mohamed", "Ali",
        "0501020304", 3.3, "Riyadh", birthDate1);
        System.out.println("count= "+Student.getCount());
        
        //Date birthDate2 = new Date(4,3,1983);
        //Date bd2 = new Date(4,12,1985);
        Student student2 = new Student("Ahmed", "Mounir", 
        "0511223344", 3.45, "Riyadh", new Date(4,3,1983));
       
       
       System.out.println("count= "+Student.getCount());
        
        Student student3 = new Student("Ahmed", "Mounir", 
        "0511223344", 3.45, "Riyadh", new Date(5,5,1982));
        
        
        Student st4 = new Student();
        System.out.println("count = " + Student.getCount());
        
        //student1.printInfo();
        //student2.printInfo();
        
        //student1.printGPA();
        
        studentList.add(student1);
        studentList.add(student2);
        
        //for (int i=0;i<studentList.size();i++){
        //    studentList.get(i).printInfo();
        //}
        
        for (Student s : studentList){
            s.printInfo();
        }
        
        /* not longer needed */
        //student1.firstName = "Kamel";
        //student1.lastName = "Anis";
        //student1.phone = "t253usi93";
        try{
        student1.setPhone("0501020304");
        }catch (IllegalArgumentException e){
            System.out.println("Wrong Phone Number. The program will exit");
        }
//student1.gpa = 3.5;
        //student1.address = "Riyadh";
        
        
        System.out.println("Student1 Phone: "+ student1.getPhone());
        /* not longer needed */
        //student2.firstName = "Ahmed";
        //student2.lastName = "Mounir";
        //student2.phone = "051122334454";
        //student2.GPA = 3.45;
        //student2.address  = "Riyadh";
        
        
        System.out.println("student1 : "+ student1);
        
        System.out.println("student2 : "+ student2);
        
        
        System.out.println("Year of birth of student1: "+
                student1.getBirthDate().getYear());
        System.out.println("Month of birth of student2: "+
                student2.getBirthDate().getMonth());
        
        System.out.println("Student3 birth date before change: "+
                student3.getBirthDate());
        //modify the day of birth of student3 to 28
        student3.getBirthDate().setDay(28);
        System.out.println("Student3 birth date after change: "+
                student3.getBirthDate());
        
        //change the birth date of student2 to 5/6/1990
        
        //Date newBirthDate = new Date (5,6,1990);
        student2.setBirthDate(new Date (5,6,1990));
        
        System.out.println("Student2 birth date after change: "+
                student2.getBirthDate());
        
        
        
        
        
        
        
        
    }
    
}
