package exams.quizzes.spring2016.quiz1;

public class Edge {
    
    private Vertex source;
    private Vertex destination;
    private double cost;

    public Edge(Vertex source, Vertex destination, double cost) {
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    public String toString(){
        return String.format("%d -> %d", 
                this.getSource().getId(), this.getDestination().getId());
    }
}
