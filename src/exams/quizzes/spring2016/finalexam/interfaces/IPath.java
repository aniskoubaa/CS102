package exams.quizzes.spring2016.finalexam.interfaces;

import java.util.List;

public interface IPath <V extends IVertex, E extends IEdge>{
 
    IGraph <V,E> getGraph();
    List<V> getPath();
    
    
}
