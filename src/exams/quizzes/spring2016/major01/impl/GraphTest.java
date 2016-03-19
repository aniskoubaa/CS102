package exams.quizzes.spring2016.major01.impl;

import exams.quizzes.spring2016.major01.interfaces.IUndirectedEdge;
import exams.quizzes.spring2016.major01.interfaces.IUndirectedGraph;
import exams.quizzes.spring2016.major01.interfaces.IVertex;

public class GraphTest {
    
    public static void main(String [] args){
        
        IUndirectedGraph graph = new UndirectedGraph();
        
        IVertex v0 = new Vertex(0,"V0");
        IVertex v1 = new Vertex(1,"V1");
        IVertex v2 = new Vertex(2,"V2");
        IVertex v3 = new Vertex(3,"V3");
        
        /** Task 1. add vertices to the graph */
        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        
        
        
        IUndirectedEdge ue1 = 
                new UndirectedEdge(
                        graph.getVertices().get(2),
                        graph.getVertices().get(0),
                        2.32);
        IUndirectedEdge ue2 = 
                new UndirectedEdge(
                        graph.getVertices().get(1),
                        graph.getVertices().get(0),
                        3.85);
        
        IUndirectedEdge ue3 = 
                new UndirectedEdge(
                        graph.getVertices().get(0),
                        graph.getVertices().get(3),
                        3.85);
        
        IUndirectedEdge ue4 = 
                new UndirectedEdge(
                        graph.getVertices().get(3),
                        graph.getVertices().get(2),
                        3.85);
        
        /** Task 2. add edges to the graph */
        graph.addEdge(ue1);
        graph.addEdge(ue2);
        graph.addEdge(ue3);
        graph.addEdge(ue4);
        
        /** add edges to the graph */
        System.out.println(graph);
        
        /** Task 3. print the degree of all vertices
         in the form
         * vertexID: degree
         */
        System.out.println("Degree of vertices");
        for (IVertex v : graph.getVertices())
            System.out.printf("%d: %d\n",
                    v.getID(),graph.getDegree(v));
        graph.printToFile("graph.txt");
        
    }    
}
