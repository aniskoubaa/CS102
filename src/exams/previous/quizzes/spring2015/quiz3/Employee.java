package exams.previous.quizzes.spring2015.quiz3;
public abstract class Employee extends Person {
    
    private String employeeID;

    public Employee(String employeeID, String firstName, String lastName, Contact contact) {
        super(firstName, lastName, contact);
        setEmployeeID(employeeID);
    }
    

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID.length()==10 && employeeID.startsWith("EM"))
            this.employeeID = employeeID;
        else throw new IllegalArgumentException("Employee ID not correct");
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", employeeID, super.toString());
    }

}
