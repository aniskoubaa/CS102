
package exams.previous.quizzes.fall2015.quiz3;


public interface Queuable {
    public abstract void enqueue(Object ob);
    public abstract Object dequeue();  
    public abstract int getSize();

}
