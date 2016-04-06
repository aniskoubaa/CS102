package topic06.jcf;

public class Student implements Comparable<Student>{
    
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return firstName +" "+ lastName + "("+age+")";
    }


    public int compareTo(Student st) {
        if (this.firstName.compareTo(st.getFirstName())!=0)
        return firstName.compareTo(st.getFirstName());
        else
            return lastName.compareTo(st.getLastName());
    }
    
}
