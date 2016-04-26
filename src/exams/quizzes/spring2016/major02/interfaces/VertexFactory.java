package exams.quizzes.spring2016.major02.interfaces;


public interface VertexFactory <V extends IVertex>
{
    V create();
    V create(int id, String data);
}
