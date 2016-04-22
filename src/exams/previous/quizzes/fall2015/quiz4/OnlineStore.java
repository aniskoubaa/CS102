/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz4;


public class OnlineStore {
    
    public static void main(String [] args){
        
        /** task 1: Create the object [store] of the class Store **/
        Store store = Store.getInstance();
        
        /** task 2: create a new FactoryProduct object **/
        ProductFactory pf = new ProductFactory();
        
       
        //define books
        String [] authors_book1= {"Anis Koubaa"};
        String [] authors_book2= {"Mohamed Affendi"};
        
        /** task 3: 
         * task 3.1: using Product Factory, create a book1 as 1, 
         * 1"Java Programming", 120.35, authors_book1, "1234569" 
         * task 3.2: add the created book into the products ArrayList of the store object
         */
         
        IProduct book = pf.getProduct("BookProduct", 1, "Java Programming",
                120.35, authors_book1, "1234569");
        store.getProducts().add((Product)book);
        
        BookProduct book1 = (BookProduct) pf.getProduct(1, "Java Programming",
                120.35, authors_book1, "1234569");
        
        
        /** task 4: 
         * task 4.1: using Product Factory, create a mobile1 as 
         * {1, 2, "iPhone6", 3500.0, "iPhone"} 
         * task 4.2: add the created book into the products ArrayList of the store object
         */
        
        IProduct mp = pf.getProduct("MobilePhoneProduct", 1, "iPhone6",
                3500.0, null, "iPhone");
        store.getProducts().add((Product)mp);

        //define customer
        //define customer
        Street st1 = new Street (1,"Rafha Street", "Riyadh");
        Address a1 = new Address (st1, "Riyadh ", "Saud Arabia", 14523);
        
        Street st2 = new Street (12,"Olya Street", "Riyadh");
        Address a2 = new Address (st2, "Riyadh ", "Saud Arabia", 14523);
        
        Customer customer1 = new Customer ("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer ("FG25", "Hassan Mounir", a1);
        
        /** task 5: 
         * fix the error in "phones[0]" and "books[0]" by putting the two products that are in the store ArrayList
         */
        
        Order order1 = new Order (customer1, (Product)mp, customer1.getAddress());
        
        Address shippingAddress1 = a2;
        Order order2 = new Order (customer2, (Product)book, customer2.getAddress());
        
        /** task 6: 
         * add the orders into the orders ArrayList of store
         */
        
        store.getOrders().add(order1);
        store.getOrders().add(order2);
    }
    
}

