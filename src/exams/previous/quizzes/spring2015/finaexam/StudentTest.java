/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String []args) throws FileNotFoundException{
        
        University U = new University();
        U.loadUniversityPersons("Students.json","Instructors.json", "Staff.json");
        Scanner input = new Scanner(System.in);
        System.out.println("Student ID");
        String id = input.nextLine();
        
        if (U.persons.keySet().contains(id)){
            System.out.println("Student is" + U.persons.get(id));
        }
        else 
            System.out.println("Cannot find student");
        
        
        
    }
    
}
