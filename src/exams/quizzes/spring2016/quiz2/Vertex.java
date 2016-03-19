package exams.quizzes.spring2016.quiz2;

public class Vertex {
    
    private int id;
    private String data;//must be of the form www.name.domain

    public Vertex(int id, String data) {
        setId(id);
        setData(data);
    }
    
    public Vertex(Vertex v){
        this(v.getId(), v.getData());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        //make data validation
        this.data = data;
    }
    
    public boolean equal(Vertex v){
        if ((v.getId()!=this.getId())&&(!this.getData().equals(v.getData())))
            return false;
        return true;
    }
    
    public String toString(){
        //return String.format("{\"id\":\"%s\", \"data\":\"%s\"}",
        //        id, data);
        return data;
    }
  
}
