package exams.quizzes.spring2016.major01.interfaces;

public interface IDirectedEdge extends IEdge{
    
    public abstract IVertex getSource();
    public abstract IVertex getTarget();
    public abstract void setSource(IVertex v);
    public abstract void setTarget(IVertex v);
}
