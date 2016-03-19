package exams.quizzes.spring2016.major01.impl;

import exams.quizzes.spring2016.major01.interfaces.IEdge;
import exams.quizzes.spring2016.major01.interfaces.IUndirectedEdge;
import exams.quizzes.spring2016.major01.interfaces.IUndirectedGraph;
import exams.quizzes.spring2016.major01.interfaces.IVertex;

public class UndirectedGraph extends Graph implements IUndirectedGraph{
    
    public int getDegree(IVertex v){
        int count=0;
        for (IEdge e : this.getEdges()){
            boolean c1 = (e instanceof IUndirectedEdge);
            if (c1){
                boolean c2= ((IUndirectedEdge)e).getFirst().equals(v);
                boolean c3= ((IUndirectedEdge)e).getSecond().equals(v);
                if (c2 || c3){
                    count++;
                }
            }else throw new ClassCastException ("All Edges must be IUndirectedEdge");
            
        }
        return count;
    }
    
    public void addEdge(IEdge e){
        if ((!getEdges().contains(e))&&(e instanceof IUndirectedEdge))
            this.getEdges().add(e);
    }
    
    public String toString(){
        String s="";
        s=s+this.getGraph().getVertices().size()+"\n";
        for (IVertex v : vertices){
            s=s+String.format("%s: ",v.getID());
            for (IEdge e : edges){
            if ((((UndirectedEdge)e).getFirst().equals(v)))
                    s=s+String.format("%s ",((UndirectedEdge)e).getSecond().getID());
            else if ((((UndirectedEdge)e).getSecond().equals(v)))
                    s=s+String.format("%s ",((UndirectedEdge)e).getFirst().getID());
            //else if ((e.getSecond().equal(v)))
            //        s=s+String.format("%s, ",e.getFirst());
            }
            s=s+"\n";
        }
        return s;
    }
    
}
