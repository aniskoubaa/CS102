package exams.quizzes.spring2016.quiz2;

public class WeightedEdge extends Edge{

      private double weight;

    public WeightedEdge(Vertex source, 
            Vertex second, 
            double weight) {
        super(source, second);
        setWeight(weight);
    }
    public WeightedEdge(WeightedEdge e){
        this(e.getFirst(),e.getSecond(),e.getWeight());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
      
    public String toString(){
        return String.format("%d <-(%.2f)-> %d", 
                this.getFirst().getId(),this.getWeight(), this.getSecond().getId());
    }
    
}
