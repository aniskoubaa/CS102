
package exams.previous.quizzes.fall2014.quiz2;


public class MobilePhoneProduct extends ElectronicProduct{
    
   public static final String [] BRANDS = {"Samsung", "iPhone", "Huawei"};

    public MobilePhoneProduct(String brand, int id, String label, double price) {
        super(brand, id, label, price);
        setBrand(brand);
    }
    
    @Override
    public void setBrand(String brand){
        
        //super.setBrand(null);
        for (String s: BRANDS){
            if (brand.equalsIgnoreCase(s)){
                super.setBrand(brand);
                break;
            }
        }
        
    }
    
    @Override
    public String toString() {
        return String.format("MobilePhoneProduct{%s}", super.toString());
    }
   
    
}


