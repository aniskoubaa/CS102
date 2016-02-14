package exams.previous.quizzes.fall2014.quiz2;


public class ElectronicProduct extends Product{
    
private String brand;

    public ElectronicProduct(String brand, int id, String label, double price) {
        super(id, label, price);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
  
}
