package exams.quizzes.spring2016.finalexam.impl;

import exams.quizzes.spring2016.major02solution.impl.*;
import exams.quizzes.spring2016.major02.interfaces.IVertex;
import exams.quizzes.spring2016.major02.interfaces.VertexFactory;

public class FacebookUserFactory implements VertexFactory{

    @Override
    public IVertex create() {
        return new FacebookUser();
    }
    
    @Override
    public IVertex create(int id, String data) {
        return new FacebookUser(id, data);
    }
    
}
