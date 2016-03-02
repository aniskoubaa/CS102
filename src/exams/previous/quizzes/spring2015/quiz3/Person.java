package exams.previous.quizzes.spring2015.quiz3;
public abstract class Person implements Printable{
    
    private String firstName;
    private String lastName;
    private Contact contact;
    private Date birthDate;

    public Person(String firstName, String lastName, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }
    
    public abstract String getDescription();
   
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

    public  Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
    public String toString(){
        return String.format("%s %s %s", firstName, lastName, contact);
    }
    
    
}
