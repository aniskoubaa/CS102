/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2014.quiz2;

/**
 *
 * @author akoubaa
 */
public class Order {
    
    Customer customer;
    Product product;
    Address ShippingAddress;

    public Order(Customer customer, Product product, Address ShippingAddress) {
        this.customer = customer;
        this.product = product;
        this.ShippingAddress = ShippingAddress;
    }

    @Override
    public String toString() {
        return "Order{\n" + "\t customer=" + customer + "\t product=" + product + "\tShippingAddress=" + ShippingAddress + "\n}\n";
    }
    
    

    public Address getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(Address ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
