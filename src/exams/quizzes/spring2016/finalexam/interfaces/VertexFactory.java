package exams.quizzes.spring2016.finalexam.interfaces;

import exams.quizzes.spring2016.major02solution.interfaces.*;


public interface VertexFactory <V extends IVertex>
{
    V create();
    V create(int id, String data);
}
