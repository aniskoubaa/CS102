/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.quiz2;


public class DirectedWeightedEdge extends WeightedEdge{

    public DirectedWeightedEdge(Vertex source, Vertex second,double weight) {
        super(source, second, weight);
    }
    

    public Vertex getSource(){
        return this.getFirst();
    }
    
    public void  setSource(Vertex source){
        this.setFirst(source);
    }
    
    public Vertex getTarget(){
        return this.getSecond();
    }
    
    public void  setTarget(Vertex target){
        this.setSecond(target);
    }
    
    public String toString(){
        return String.format("%d -(%.2f)-> %d", 
                this.getFirst().getId(),this.getWeight(), this.getSecond().getId());
    }
    
}
