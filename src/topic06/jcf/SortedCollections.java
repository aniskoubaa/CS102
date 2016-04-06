package topic06.jcf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortedCollections {
    
    public static <T> void print(Collection <T> collection){
        Iterator <T> it = collection.iterator();
        while(it.hasNext()){
            T t = it.next();
            System.out.println(t+ " ");
        }
        System.out.println("");
    }
    
    
    
    public static void main(String []args) throws Exception{
        
        
        List<Student> studentsList = new LinkedList<Student>();
        studentsList.add(new Student("Mohamed", "Ahmed", 25));
        studentsList.add(new Student("Ali", "Ali", 30));
        studentsList.add(new Student("Mounir", "Hamdi", 20));
        studentsList.add(new Student("Kamel", "Salah", 34));
        studentsList.add(new Student("Malek", "Raj", 29));
        studentsList.add(new Student("Samir", "Samer", 18));
        
        
        Set<Student> studentsSet = 
                new TreeSet<Student>(studentsList);
        
        //System.out.println(studentsList);
        //System.out.println(studentsSet);
        //System.out.println(studentsList.size());
        //System.out.println("\n");
        
        print(studentsList);
        print(studentsSet);
        
        //How to sort the studentsList?
        Collections.sort(studentsList);
        print(studentsList);
        
        //How to sort the studentList according to the age?
        //without changing the compareTo method
        Collections.sort(studentsList, 
                new StudentAgeComparator());
        print(studentsList);
        
        Collections.sort(studentsList, 
                new StudentLastNameComparator());
        print(studentsList);
        
        System.out.println(Collections.max(studentsList));
        System.out.println(Collections.max(studentsList, new StudentAgeComparator()));
        
    
    }
    
    
    
}
