/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz2;


public class Person {
    
    private String firstName;
    private String lastName;
    private Contact contact;

    public Person(String firstName, String lastName, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public Person(){
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public String toString(){
        return String.format("full name: %s %s\ncontact: %s", firstName, lastName, contact);
    }
    
    
}
