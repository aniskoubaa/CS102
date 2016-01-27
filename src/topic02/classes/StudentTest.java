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
        
        //new Student(): creates a new object in the memory
        Student student1 = new Student("Mohamed", "Ali",
        "0501020304", 3.3, "Riyadh");
        Student student2 = new Student("Ahmed", "Mounir", 
        "0511223344", 3.45, "Riyadh");
        
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
        
        
        
        
        
    }
    
}
