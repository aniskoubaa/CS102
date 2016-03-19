package exams.quizzes.spring2016.quiz2;

import java.util.ArrayList;


public class GraphTest {
    public static void main(String []args){
        
        
        Graph graph = new Graph();
        Vertex v0 = new Vertex(0,"V0");
        Vertex v1 = new Vertex(1,"V1");
        Vertex v2 = new Vertex(2,"V2");
        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        
        DirectedWeightedEdge we1 = 
                new DirectedWeightedEdge(
                        graph.getVertices().get(2),
                        graph.getVertices().get(0),
                        2.32);
        DirectedWeightedEdge we2 = 
                new DirectedWeightedEdge(
                        graph.getVertices().get(1),
                        graph.getVertices().get(0),
                        3.85);
        
        graph.addEdge(we1);
        graph.addEdge(we2);
        
        for (Edge e : graph.edges){
            System.out.println(e);
        }
        
        
        
        
        Edge e1 =new Edge(graph.getVertices().get(0),graph.getVertices().get(1));
        Edge e2 =new Edge(graph.getVertices().get(0),graph.getVertices().get(2));        
        
        
       
        
        
        
        
        
        System.out.println(graph);
        
        System.out.println(we1);
        
        //graph.addEdge(new Edge(graph.getVertices().get(0),graph.getVertices().get(1)));
        //graph.addEdge(new Edge(graph.getVertices().get(0),graph.getVertices().get(2)));
       /*Vertex v =new  Vertex(0,"V0");
       if (edges.get(0).getFirst()==v)
            System.out.println("EQUAL");
       else
           System.out.println("NOT EQUAL");
        System.out.println("vertices: "+vertices);
        System.out.println("edges   : "+edges);
        */
        
        System.out.println(graph);
        graph.addEdge(new Edge(graph.getVertices().get(1),graph.getVertices().get(2)));
        graph.addEdge(new Edge(graph.getVertices().get(2),graph.getVertices().get(0)));
        System.out.println(graph);
        graph.removeEdge(graph.getEdges().get(1));
        System.out.println(graph);
        
        System.out.println(graph.vertices);
        System.out.println(graph.edges);
        WeightedGraph wg = new WeightedGraph();
        wg.addVertex(new Vertex(0,"V0"));
        wg.addVertex(new Vertex(1,"V1"));
        wg.addVertex(new Vertex(2,"V2"));
        wg.addEdge(new WeightedEdge(graph.getVertices().get(0),graph.getVertices().get(2),1.2));
        wg.addEdge(new WeightedEdge(graph.getVertices().get(1),graph.getVertices().get(0),3.4));
        wg.addEdge(new WeightedEdge(graph.getVertices().get(2),graph.getVertices().get(1),3.4));
        
        System.out.println(wg.getEdges());
        System.out.println(wg.getVertices());
        System.out.println(wg);
    }
    
}
