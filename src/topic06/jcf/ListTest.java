package topic06.jcf;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ListTest {
    
    
    private static void removeColors(Collection<String> c, Collection<String>cr){
        
        //delcare the iterator
        Iterator <String> it = c.iterator();
        while(it.hasNext()){
            String s = it.next();
            if (cr.contains(s))
                //c.remove(s);
                it.remove();
        }
        
        /*for (String s : c){
            if (cr.contains(s))
                c.add(s);
        }*/
        
    }
    
    public static void main(String []args) throws Exception{
        List<String> colorList = new ArrayList<String>();
        List<Student> students = new LinkedList<Student>();
        
        colorList.add("BLUE");
        colorList.add("WHITE");
        colorList.add("RED");
        colorList.add("BLACK");
        colorList.add("ORANGE");
        colorList.add("YELLOW");
        colorList.add("BLUE");
        colorList.add("WHITE");
        colorList.add("RED");
        
        System.out.println(colorList);
        
        Collections.sort(colorList);
        
        System.out.println(colorList);
        
        
        
        students.add(new Student("Mohamed", "Ahmed", 25));
        students.add(new Student("Ali", "Ali", 30));
        students.add(new Student("Mounir", "Hamdi", 20));
        students.add(new Student("Kamel", "Salah", 26));
        students.add(new Student("Kamel", "Salah", 26));
        students.add(new Student("Kamel", "Salah", 26));
        
         System.out.println(students);
         
         //Collections.sort(students);
         
         System.out.println(students);
         
         Collections.sort(students, new StudentAgeComparator());
        
         System.out.println(students);
         
         Collections.sort(students, new StudentLastNameComparator());
        
         System.out.println(students);
         
         //System.out.println("max comparable: "+Collections.max(students));
         //System.out.println("min comparable: "+Collections.min(students));
         
         System.out.println("max age: "+Collections.max(students, new StudentAgeComparator()));
         System.out.println("min age: "+Collections.min(students, new StudentAgeComparator()));
        
         
         System.out.println("max last name: "+Collections.max(students, new StudentLastNameComparator()));
         System.out.println("min last name: "+Collections.min(students, new StudentLastNameComparator()));
        
         //Collections.sort(students, Collections.reverseOrder());
         System.out.println(students);
        
         List<Student> students1 = new ArrayList<Student>();
          students1.add(new Student("Mohamed", "Ahmed", 25));
           students1.add(new Student("Mohamed", "Ahmed", 25));
            students1.add(new Student("Mohamed", "Ahmed", 25));
             students1.add(new Student("Mohamed", "Ahmed", 25));
           
         System.out.println(students1);
         //Collections.copy(students1, students);
         System.out.println(students1);
         
        //List<String> colorToRemove = new ArrayList<String>();
        //colorToRemove.add("RED");
        //colorToRemove.add("BLACK");
        //colorToRemove.add("ORANGE");
        
        //Iterator<String> it = colorList.iterator();
        
        //System.out.println("before remove: "+colorList);
        //removeColors(colorList, colorToRemove);
       
        //System.out.println("after remove: "+colorList);
        
        Stack<Integer> ints = new Stack<Integer>();
        ints.push(14);
        ints.push(16);
        ints.push(10);
        ints.push(12);
        
        while (!ints.isEmpty()){
            System.out.println(ints.pop());
        }

        
        PriorityQueue <Double> queue = new PriorityQueue<Double>();  
        
        queue.offer(11.9);
        queue.add(10.32);
        queue.offer(4.3);
        queue.offer(23.4);
        queue.offer(65.9);
        queue.offer(5.9);
        queue.offer(15.9);
        
        System.out.println(queue);
        
        while(queue.size()>0){
            System.out.println(queue.peek());
            queue.poll();
        }
        
        PriorityQueue <Student> studentq = new PriorityQueue<Student>();
        
        
        studentq.add(new Student("Mohamed", "Ahmed", 25));
        studentq.add(new Student("Ali", "Ali", 30));
        studentq.add(new Student("Zakir", "Hamdi", 20));
        studentq.add(new Student("Kamel", "Salah", 26));
        
        while(studentq.size()>0){
            System.out.println(studentq.peek());
            studentq.poll();
        }
        
        
        
        /*  SETS */
        
        Set <String> colorSet = new HashSet<String>(colorList);
        /*
        colorSet.add("BLUE");
        colorSet.add("WHITE");
        colorSet.add("RED");
        colorSet.add("BLACK");
        colorSet.add("ORANGE");
        colorSet.add("YELLOW");
        colorSet.add("BLUE");
        colorSet.add("WHITE");
        colorSet.add("RED");
        */
        System.out.println(colorSet);
        System.out.println(colorSet.size());
        
        Integer [] intArray ={1,3,1,5,7,3,2,6,2};
        
        SortedSet<Integer> intSet = new TreeSet<Integer>(Arrays.asList(intArray));
                
        System.out.println(intSet);
        System.out.println(intSet.size());
                
                
        TreeSet<Student> studentSet = new TreeSet<Student>(students);
        System.out.println(studentSet);  
        
       
        
        for (Student s : studentSet){
            System.out.println("s="+s);
        }
        
        
        Iterator<Student> it = studentSet.iterator();
        
        while(it.hasNext()){
            System.out.println("s="+it.next());
        }
                
                
        
        
    }
    
    
}
