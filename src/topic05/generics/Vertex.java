package topic05.generics;
import topic05.generics.*;
import exams.quizzes.spring2016.major01.impl.*;
import exams.quizzes.spring2016.major01.interfaces.IVertex;

public class Vertex implements IVertex, Comparable<Vertex>{

    private int id;
    private String data;

    public Vertex(int id, String data) {
        this.id = id;
        this.data = data;
    }

    
    @Override
    public IVertex getVertex() {
        return this;
    }

    @Override
    public void setVertex(IVertex v) {
        setID(v.getID());
        setData(v.getData());
        
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setID(int id) {
        this.id=id;
    }

    @Override
    public void setData(String data) {
        this.data=data;
    }
    
    @Override 
    public boolean equals(Object v){
        if (v instanceof IVertex){
            if (((IVertex)v).getID()==this.getID())
                return true;
        }
        return false;
    }
    
    public String toString(){
        return String.format("%s", data);
    }

    @Override
    public int compareTo(Vertex o) {
        return this.getID()-o.getID();
    }

}
