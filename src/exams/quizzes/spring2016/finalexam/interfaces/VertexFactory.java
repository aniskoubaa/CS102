package exams.quizzes.spring2016.finalexam.interfaces;


public interface VertexFactory <V extends IVertex>
{
    V create();
    V create(int id, String data);
}
