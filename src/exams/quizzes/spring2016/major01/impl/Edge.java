package exams.quizzes.spring2016.major01.impl;

import exams.quizzes.spring2016.major01.interfaces.IEdge;
import exams.quizzes.spring2016.major01.interfaces.IVertex;


public abstract class Edge implements IEdge{
    
    private double weight;
    protected IVertex first;
    protected IVertex second;
    
    public Edge(){
        weight=0.0;
    }
    
    public Edge(double weight){
        if (weight>0)
        this.weight=weight;
    }
    
    public Edge(IEdge e){
        if (weight>0)
        this.weight=weight;
    }
    
    public IEdge getEdge(){
        return this;
    }
    
    public void setEdge(IEdge e){
        this.weight=e.getWeight();
    }
        
    public double getWeight(){
        return weight;
    }
    public void   setWeight(double weight){
        if (weight>0)
        this.weight=weight;
    }   
      
}
