package exams.quizzes.spring2016.quiz2;

public class Edge {
    
    private Vertex first;
    private Vertex second;
    
    public Edge(Vertex source, Vertex second) {
        this.first = source;
        this.second = second;
    }
    public Edge(Edge e) {
        this(e.getFirst(), e.getSecond());
    }

    public Vertex getFirst() {
        return first;
    }

    public void setFirst(Vertex source) {
        this.first = source;
    }

    public Vertex getSecond() {
        return second;
    }

    public void setSecond(Vertex second) {
        this.second = second;
    }
   
    public String toString(){
        return String.format("%d <-> %d", 
                this.getFirst().getId(), this.getSecond().getId());
    }
}
