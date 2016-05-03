package exams.quizzes.spring2016.finalexam.interfaces;

public interface EdgeFactory <E,V>{
    E create(V source, V target);
}
