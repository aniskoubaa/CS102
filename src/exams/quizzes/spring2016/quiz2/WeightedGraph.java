/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.quiz2;

import java.util.List;


public class WeightedGraph extends Graph{

    public WeightedGraph(List<Vertex> vertices, List<Edge> edges) {
        super(vertices, edges);
    }
    
    public WeightedGraph() {
        super();
    }
    
    public void addEdge (Edge e){
        if (e instanceof WeightedEdge){
            WeightedEdge we = (WeightedEdge)e;
            edges.add(new WeightedEdge(we.getFirst(), we.getSecond(), we.getWeight()));
        } 
        else throw new IllegalArgumentException("WeightedEdge must in parameter");
    }
    
    public String toString(){
        String s="";
        for (Vertex v : vertices){
            s=s+String.format("%s: ",v);
            for (Edge e : edges){
                if (e instanceof WeightedEdge){
                    WeightedEdge wg =(WeightedEdge)e;
                    if ((e.getFirst().equal(v)))
                    s=s+String.format("(%s,%.2f), ",e.getSecond(),wg.getWeight());
            } else throw new IllegalArgumentException("WeightedEdge must in parameter");
            
                }
            s=s+"\n";
        }
        return s;
    }
    
}
