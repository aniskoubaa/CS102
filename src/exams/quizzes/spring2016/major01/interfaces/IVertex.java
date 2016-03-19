package exams.quizzes.spring2016.major01.interfaces;

public interface IVertex {
    
    public abstract IVertex getVertex();
    public abstract void setVertex(IVertex v);
    public abstract int getID();
    public abstract String getData();
    public abstract void setID(int id);
    public abstract void setData(String data);
    
}
