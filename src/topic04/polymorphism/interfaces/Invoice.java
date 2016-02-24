
package topic04.polymorphism.interfaces;



/**
 *
 * @author akoubaa
 */
public class Invoice implements Payable, Comparable<Invoice>
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   // four-argument constructor
   public Invoice( String part, String description, int count, 
      double price )
   {
      partNumber = part;
      partDescription = description;

      if ( count > 0 ) // determine whether count is positive
         quantity = count; // valid count assigned to quantity

      if ( price > 0.0 ) // determine whether price is positive
         pricePerItem = price; // valid price assigned to pricePerItem
   } // end four-argument Invoice constructor

   // set part number
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } // end method setPartNumber

   // get part number
   public String getPartNumber()
   {
      return partNumber;
   } // end method getPartNumber

   // set part description
   public void setPartDescription( String description )
   {
      partDescription = description;
   } // end method setPartDescription

   // get part description
   public String getPartDescription()
   {
      return partDescription;
   } // end method getPartDescription

   // set quantity
   public void setQuantity( int count )
   {
      if ( count > 0 ) // determine whether count is positive
         quantity = count; // valid count assigned to quantity

      if ( count <= 0 ) // determine whether count is zero or negative
         quantity = 0; // invalid count; quantity set to 0
   } // end method setQuantity

   // get quantity
   public int getQuantity()
   {
      return quantity;
   } // end method getQuantity

   // set price per item
   public void setPricePerItem( double price )
   {
      if ( price > 0.0 ) // determine whether price is positive
         pricePerItem = price; // valid price assigned to pricePerItem

      if ( price <= 0.0 ) // determine whether price is zero or negative
         pricePerItem = 0.0; // invalid price; pricePerItem set to 0.0
   } // end method setPricePerItem

   // get price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } // end method getPricePerItem

 
   @Override
   public double getPayment(){
       return pricePerItem*quantity;
   }
   
   @Override
   public int compareTo(Invoice invoice){
       //return (int) (this.getPayment()-invoice.getPayment());
       /*if (this.getPayment()>invoice.getPayment())
           return 1;
       else if (this.getPayment()<invoice.getPayment())
           return -1;
       return 0;*/
       return this.getPartNumber().compareTo(invoice.getPartNumber());
   }
   
   @Override
   public String toString(){
       return String.format("invoice: \n"
               + "part number: %s (%s)\n"
               + "quantity: %d\n"
               + "price per item: %,.2f\n"
               + "payment: %.2f",
               getPartNumber(), getPartDescription(),
               getQuantity(), getPricePerItem(), getPayment());
   }
   
   
   
} // end class Invoice


