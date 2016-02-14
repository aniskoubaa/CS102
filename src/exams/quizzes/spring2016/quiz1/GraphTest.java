package exams.quizzes.spring2016.quiz1;

import java.util.ArrayList;


public class GraphTest {
    public static void main(String []args){
        ArrayList<Vertex> vertices = new ArrayList<Vertex>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        
        vertices.add(new Vertex(0,"V0"));
        vertices.add(new Vertex(1,"V1"));
        vertices.add(new Vertex(2,"V2"));
        
        edges.add(new Edge(vertices.get(0),vertices.get(1), 1.0));
        edges.add(new Edge(vertices.get(0),vertices.get(2), 1.0));
        
        
        System.out.println("vertices: "+vertices);
        System.out.println("edges   : "+edges);
    }
    
}
