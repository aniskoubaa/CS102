package exams.previous.quizzes.fall2015.quiz4;

import java.util.ArrayList;

public class Store {
    
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    
    private static Store instance = null;
        
    private Store(){
        products = new ArrayList<Product>();
        orders = new ArrayList<Order>();
    }
    
    private Store(ArrayList<Product> products){
        this.products = products;
    }
    
    public static Store getInstance(){
        if (instance == null){
            instance = new Store();
        }
        return instance;
    }
    
    public static Store getInstance(ArrayList<Product> products){
        if (instance == null){
            instance = new Store(products);
        }
        return instance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public ArrayList<Order> getOrders() {
        return orders;
    }
      
}
