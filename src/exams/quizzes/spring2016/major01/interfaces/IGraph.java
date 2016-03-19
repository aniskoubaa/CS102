package exams.quizzes.spring2016.major01.interfaces;

import java.util.List;

public interface IGraph {
    
    public abstract IGraph getGraph();
    public abstract List<IVertex> getVertices();
    public abstract List<IEdge> getEdges();
    
    public abstract void setVertices(List<IVertex> vertices);
    public abstract void setEdges(List<IEdge> edges);
    
    
    public abstract void addVertex(IVertex v);
    public abstract void addEdge(IEdge v);
    
    public abstract void printToFile(String fileName);
    public abstract void loadFromFile(String fileName);
    
}
