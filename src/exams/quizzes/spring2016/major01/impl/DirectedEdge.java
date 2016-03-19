package exams.quizzes.spring2016.major01.impl;
import exams.quizzes.spring2016.major01.interfaces.IDirectedEdge;
import exams.quizzes.spring2016.major01.interfaces.IVertex;

public class DirectedEdge extends Edge implements IDirectedEdge{
    
    public DirectedEdge(IVertex source, IVertex target, double weight){
        setSource(source);
        setTarget(target);
        setWeight(weight);
    }
    
    public IVertex getSource(){
        return first;
    }
    public IVertex getTarget(){
        return second;
    }
    public void setSource(IVertex v){
        first = v;
    }
    public void setTarget(IVertex v){
        second = v;
    } 
    
    public String toString(){
        return String.format("%d -(%.2f)-> %d", 
                this.getSource(),
                this.getWeight(), this.getTarget());
    }
    
    
}
