/*
 2.	Write a test program that creates an array of three Person objects as follow:
•	Person 1: [Ali Hassan], 12/10/1980, 
        “King Abdullah Road, Riyadh, Saudi Arabia”
•	Person 2: [354624]: [Salem Al-Salem], 12/09/1980, 
        “King Khaled Road, Jeddah, Saudi Arabia
•	Person 3: The third object is created with 
        the default constructor. 
•	Set of the Person 3 name to “Mounir Hamdi”, its birth date to “14/05/1970” and its address to “King Faisal Street, Makkah, Saudi Arabia”. 
Display the information of all persons.

 */
package exams.previous.quizzes.fall2014.quiz1;

/**
 *
 * @author akoubaa
 */
public class PersonTest {
   public static void main(String []args){
       //Person 1: [Ali Hassan], 12/10/1980, 
       // “King Abdullah Road, Riyadh, Saudi Arabia”
       String [] fullnamePerson1 = {"Ali", "Hassan"};
       Date birthDatePerson1 = new Date(12,10,1980);
       Street streetPerson1 = new Street(1, "King Abdullah Road", "Morsalat");
       Address addressPerson1 = new Address(streetPerson1, 
               "Riyadh", "Saudi Arabia"); 
       Person person1 = new Person(fullnamePerson1,
               birthDatePerson1, addressPerson1);
       
       Person person1Copy = new Person(new String []{"Ali", "Hassan"},
               new Date(12,10,1980), 
               new Address(new Street(1, "King Abdullah Road", "Morsalat"),
                       "Riyadh", "Saudi Arabia"));
       
       
       
       //Person 2: [354624]: [Salem Al-Salem], 12/09/1980, 
       // “King Khaled Road, Jeddah, Saudi Arabia
       Person person2 = new Person(new String []{"Salem", "Al-Salem"},
               new Date(12,9,1980), 
               new Address(new Street(1, "King Khaled Road", "Morsalat"),
                       "Jeddah", "Saudi Arabia"));
       
       Person person3 = new Person();
        person3.setBirthDate(new Date(14,5,1970));
        Address address3 = new Address(
                new Street(1, "King Faisal Street", "Quarter"), 
                    "Riyadh", "Saudi Arabia");
        person3.setAddress(address3);
        person3.getFullName()[0]="Mounir";
        person3.getFullName()[1]="Hamdi";
        person3.setFullName(new String[] {"Mounir", "Hamdi"});
        
        System.out.println(person1.toString());
        System.out.println(person2);
        System.out.println(person3);
       
   } 
}
