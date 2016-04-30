/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

import exams.previous.quizzes.spring2015.finaexam.Person;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author akoubaa
 */
public class University {
    
    Map<String, Person> persons = new TreeMap<String, Person>();
    Map<String, Course> courses = new HashMap<String, Course>();
    
    
    public University(){
        
    }
    
    
    
    public void addCourse(Course c){
        courses.put(c.getCourseID(), c);
}
public void addPerson(Person p){
    
    if (p instanceof Student){
        persons.put(((Student)p).getStudentID(), p);
    }else if (p instanceof Instructor){
        persons.put(((Instructor)p).getID(), p);
    }else if (p instanceof Staff){
        persons.put(((Staff)p).getID(), p);
    }
    
}
    public void saveUniversityCourses (String CourseFileName) throws IOException{
        FileWriter fw = new FileWriter(new File(CourseFileName));
        Gson gson = new Gson();
        for (Course course : courses.values()){
            fw.write(gson.toJson(course)+"\n");
        }

        fw.close();
    }
    
    public void saveUniversityCourses2 (String CourseFileName) throws IOException{ String str="";
String textFile;
FileWriter CourseFileOutput = new FileWriter (new File (CourseFileName), false); 
Set <String> keySet = courses.keySet();
Gson gson = new Gson();

Iterator<String> it = keySet.iterator();

while (it.hasNext()){
    Course c = courses.get(it.next());
str = gson.toJson(c)+"\n"; CourseFileOutput.append(str);
    
}
//for (String key : keySet){
//str = gson.toJson(courses.get(key))+"\n"; CourseFileOutput.append(str);
//}
CourseFileOutput.close(); 
    }
    
    public void loadUniversityCourses(String CourseFileName) throws FileNotFoundException{
        Scanner CourseFileInput = new Scanner (new File (CourseFileName));
         Gson gson = new Gson();  
        while (CourseFileInput.hasNext()){
            String jsonLine = CourseFileInput.nextLine();
            Course s = gson.fromJson(jsonLine, Course.class);
            courses.put(s.getCourseID(), s);
        }
        CourseFileInput.close();
               
    }
    
    public void saveUniversityPersons (String StudentFileName, String InstructorFileName, String StaffFileName) throws IOException{

        String str="";
        String textFile;
           //1. Open the file
        FileWriter StudentFileOutput = new FileWriter (new File (StudentFileName), false);
        FileWriter InstructorFileOutput = new FileWriter (new File (InstructorFileName), false);
        FileWriter StaffFileOutput = new FileWriter (new File (StaffFileName), false);
        
        Gson gson = new Gson();  
        Set <String> keySet = persons.keySet();
           for (String key : keySet){
               if (persons.get(key) instanceof Student){
                   Student s = (Student) persons.get(key);
                   str = gson.toJson(s)+"\n"; 
                   StudentFileOutput.append(str);                                   
               } else 
                   if (persons.get(key) instanceof Instructor){
                   Instructor s = (Instructor) persons.get(key);
                   str = gson.toJson(s)+"\n"; 
                   InstructorFileOutput.append(str);                                   
               } else 
                   if (persons.get(key) instanceof Staff){
                   Staff s = (Staff) persons.get(key);
                   str = gson.toJson(s)+"\n"; 
                   StaffFileOutput.append(str);                                   
               } 
           }
           StudentFileOutput.close();
           InstructorFileOutput.close();
           StaffFileOutput.close();
    }
    
    public ArrayList<Instructor> findInstructors (Student student){
        ArrayList<Instructor> inst = new ArrayList<Instructor>();
        
       Set <String> courseSet = courses.keySet();
       Set <String> personSet = persons.keySet();
        
        for (String s : courseSet){
            if (student.getCourses().contains(s)){
                for (String p : personSet){
                    if (persons.get(p) instanceof Instructor){
                        Instructor in = (Instructor)persons.get(p);
                        if (in.isTeachingCourse(s))
                            inst.add(in);
                    }
                }
            }    
        }
        return inst;
    }


    
    
}
