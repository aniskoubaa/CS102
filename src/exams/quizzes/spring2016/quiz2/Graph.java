package exams.quizzes.spring2016.quiz2;

import java.util.ArrayList;
import java.util.List;


public class Graph {
    
    List<Vertex> vertices;
    List<Edge> edges;

    public Graph(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }
    
    public Graph(){
        //create the lists in the constructors
        vertices= new ArrayList<Vertex>();
        edges= new ArrayList<Edge>();
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
    
    public void addVertex(Vertex v){
        if (!vertices.contains(v))
            vertices.add(v);
    }
    
    public void addEdge(Edge e){
        if (!edges.contains(e))
            edges.add(e);
    }
    
    public void removeVertex(Vertex v, boolean removeEdges){
        vertices.remove(v);
        if (removeEdges){
            for (Edge e : edges){
                if ((e.getFirst().equal(v))||(e.getSecond().equal(v)))
                    edges.remove(e);
            }
        }
    }
    
    public void removeEdge(Edge e){
        edges.remove(e);
    }
    
    public String toString(){
        String s="";
        for (Vertex v : vertices){
            s=s+String.format("%s: ",v);
            for (Edge e : edges){
            if ((e.getFirst().equal(v))||(e.getSecond().equal(v)))
                    s=s+String.format("%s, ",e.getSecond());
            //else if ((e.getSecond().equal(v)))
            //        s=s+String.format("%s, ",e.getFirst());
            }
            s=s+"\n";
        }
        return s;
    }
    
    
}
