package exams.quizzes.spring2016.major01.impl;

import exams.quizzes.spring2016.major01.interfaces.IEdge;
import exams.quizzes.spring2016.major01.interfaces.IGraph;
import exams.quizzes.spring2016.major01.interfaces.IVertex;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph implements IGraph{
    List<IVertex> vertices;
    List<IEdge> edges;
    
    public Graph(){
        vertices=new ArrayList<IVertex>();
        edges=new ArrayList<IEdge>();
    }
    
    public Graph(List<IVertex> vertices, List<IEdge> edges){
        setVertices(vertices);
        setEdges(edges);
    }
       
    public IGraph getGraph(){
        return this;
    }
    public List<IVertex> getVertices(){
        return vertices;
    }
    public List<IEdge> getEdges(){
        return edges;
    }
    
    public void setVertices(List<IVertex> vertices){
        this.vertices = vertices;
    }
    
    public void setEdges(List<IEdge> edges){
        this.edges=edges;
    }
    
    public void addVertex(IVertex v){
        if (!this.vertices.contains(v))
        this.vertices.add(v);
    }
    
    public void addEdge(IEdge e){
        if (!this.edges.contains(e))
        this.edges.add(e);
    }

    @Override
    public void printToFile(String fileName) {
        FileWriter fw=null;
        try {
            fw = new FileWriter (new File(fileName));
            fw.write(this.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graph.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void loadFromFile(String fileName) {
        
    }
    
    
 
}
