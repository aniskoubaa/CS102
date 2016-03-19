package exams.quizzes.spring2016.major01.interfaces;

public interface IUndirectedEdge extends IEdge{
    
    public abstract IVertex getFirst();
    public abstract IVertex getSecond();
    
    public abstract void setFirst(IVertex v);
    public abstract void setSecond(IVertex v);
}
