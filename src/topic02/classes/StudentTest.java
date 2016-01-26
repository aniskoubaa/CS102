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
        "050102030405", 3.3, "Riyadh");
        Student student2 = new Student("Ahmed", "Mounir", 
        "051122334454", 3.45, "Riyadh");
        
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
        //student1.firstName = "Mohsen";
        //student1.lastName = "Ali";
        //student1.phone = "050102030405";
        //student1.GPA = 3.3;
        //student1.address = "Riyadh";
        
        /* not longer needed */
        //student2.firstName = "Ahmed";
        //student2.lastName = "Mounir";
        //student2.phone = "051122334454";
        //student2.GPA = 3.45;
        //student2.address  = "Riyadh";
        
        
        
        
        
    }
    
}
