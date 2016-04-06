package exams.previous.quizzes.fall2015.quiz3;

public class Task implements 
        QueuableObject, Comparable<Task>{
    
    private int priority;
    private int id;
    private String name;

    public Task(String name, int priority, int id) {
        this.priority = priority;
        this.id = id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public int compareTo(Task t){
        if (this.getPriority()!=t.getPriority()){
            return this.getPriority()-t.getPriority();
        }else
            return this.getId()-t.getId();
    }


}
