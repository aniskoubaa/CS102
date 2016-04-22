
package exams.previous.quizzes.fall2015.quiz4;


public class ProductFactory {
    
    public IProduct getProduct(
            String productType, 
            int id, 
            String label, 
            double price, 
            String [] authors, 
            String brand_isbn){
        if (productType.equalsIgnoreCase("MobilePhoneProduct")){
            authors =null;
            return new MobilePhoneProduct(id, label, price, brand_isbn);
        } else
            if (productType.equalsIgnoreCase("BookProduct")){
            return new BookProduct(id, label, price,authors, brand_isbn);
        }else
                return null;
        
    }
    
    public IProduct getProduct(
            int id, 
            String label, 
            double price,  
            String brand){
        
        return new MobilePhoneProduct(id, label, price, brand);
    }
    
    public IProduct getProduct(
            int id, 
            String label, 
            double price, 
            String [] authors, 
            String isbn){
        
        return new BookProduct(id, label, price,authors, isbn);
    }
    
    
    
}
