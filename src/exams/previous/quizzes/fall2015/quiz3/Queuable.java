
package exams.previous.quizzes.fall2015.quiz3;


public interface Queuable <T extends QueuableObject>{
    public abstract void enqueue(T ob);
    public abstract T dequeue();  
    public abstract int getSize();

}
