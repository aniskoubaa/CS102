package topic06.jcf;

import java.util.Comparator;


public class StudentLastNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getLastName().compareTo(st2.getLastName());
    }
    
}
