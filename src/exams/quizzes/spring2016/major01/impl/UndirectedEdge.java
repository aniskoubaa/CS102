package exams.quizzes.spring2016.major01.impl;
import exams.quizzes.spring2016.major01.interfaces.IUndirectedEdge;
import exams.quizzes.spring2016.major01.interfaces.IVertex;

public class UndirectedEdge extends Edge implements IUndirectedEdge{
  
    public UndirectedEdge(IVertex first, IVertex second, double weight){
        setFirst(first);
        setSecond(second);
        setWeight(weight);
    }
    
    public IVertex getFirst(){
        return first;
    }
    public IVertex getSecond(){
        return second;
    }
    
    public void setFirst(IVertex v){
        first = v;
    }
    public void setSecond(IVertex v){
        second = v;
    }
    
    public String toString(){
        return String.format("%d <-(%.2f)-> %d", 
                this.getFirst(),
                this.getWeight(), this.getSecond());
    }
    
}
