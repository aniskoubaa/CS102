package exams.quizzes.spring2016.finalexam.interfaces;

import exams.quizzes.spring2016.major02solution.interfaces.*;


public interface IEdge <V extends IVertex>{
   

    
    public abstract IVertex getSource();
    public abstract IVertex getTarget();
    public abstract void setSource(V v);
    public abstract void setTarget(V v);
}
