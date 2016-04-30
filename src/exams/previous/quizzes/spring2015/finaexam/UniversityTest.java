package exams.previous.quizzes.spring2015.finaexam;

import java.io.IOException;

public class UniversityTest {
    public static void main(String []args) throws IOException{
        
        University univ = new University();
        
        Street st = new Street (1, "Rafha Street", "Salah Eddine");
        Address address = new Address (st, "Riyadh", "Saudi Arabia");
        
        Contact contact_i1 = new Contact (new Address(new Street(10, "Olya", "Morsalat"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47896511"), new Phone("966", "011", "49173511"));
        Contact contact_s1 = new Contact (new Address(new Street(20, "Sfax", "Izdihar"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47898711"), new Phone("966", "011", "4774131"));
       
        Course CS102 = new Course ("CS102", "Java Programming II", new Department("CS", "Old Building"), 4);
        Course CS101 = new Course ("CS101", "Java Programming I", new Department("CS", "Old Building"), 4);
        
        
        Instructor inst1 = new Instructor ("Basit", "Qureshi", contact_i1, new Department("CS", "Old Building"), 1000, "111");
        Instructor inst2 = new Instructor ("Anis", "Koubaa", contact_i1, new Department("CS", "Old Building"), 1000, "100");
        Instructor inst3 = new Instructor ("Mohamed", "Affendi", contact_i1, new Department("CS", "Old Building"), 1000, "110");
        
        Student s1 = new Student("Ali", "Chabaan", contact_s1, "222");
        Student s2 = new Student("Sami", "Mohsen", contact_s1, "223");
        Student s3 = new Student("Badr", "Khaled", contact_s1, "224");
        
        Staff staff1 = new Staff ("Kamel", "Alaa", contact_i1, 1000, "300", new Department("IT", "Old Building"),  "Engineer");
        
        univ.addCourse(CS101);
        univ.addCourse(CS102);
        
        univ.addPerson(inst1);
        univ.addPerson(inst2);
        univ.addPerson(inst3);
        univ.addPerson(s1);
        univ.addPerson(s2);
        univ.addPerson(s3);
        univ.addPerson(staff1);
        System.out.println(univ.persons);
        
        s1.enroll("CS102");
        s1.enroll("CS101");
        inst1.assignCourse("CS102");
        inst2.assignCourse("CS101");
        
        
        
        
        
    }
}
