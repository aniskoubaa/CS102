package exams.quizzes.spring2016.major01.impl;

import exams.quizzes.spring2016.major01.interfaces.IDirectedEdge;
import exams.quizzes.spring2016.major01.interfaces.IDirectedGraph;
import exams.quizzes.spring2016.major01.interfaces.IEdge;

public class DirectedGraph extends Graph implements IDirectedGraph{
    
    public void addEdge(IEdge e){
        if ((!getEdges().contains(e))&&(e instanceof IDirectedEdge))
            this.getEdges().add(e);
    }
 
}
