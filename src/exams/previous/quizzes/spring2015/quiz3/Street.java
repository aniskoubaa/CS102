package exams.previous.quizzes.spring2015.quiz3;
public class Street {
    
    public int number;
    public String name;
    public String quarter;
    
    public Street (int n, String na, String q){
        number = n;
        name = na;
        quarter=q;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    @Override
    public String toString() {
        return String.format("%d %s Street, %s Quarter", this.number, this.name, this.quarter);
    }
    
    
 
}
