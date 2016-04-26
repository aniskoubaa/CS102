package exams.quizzes.spring2016.major02.interfaces;

public interface EdgeFactory <E,V>{
    E create(V source, V target);
}
