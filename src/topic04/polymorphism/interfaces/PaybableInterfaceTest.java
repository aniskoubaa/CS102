
package topic04.polymorphism.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author akoubaa
 */
public class PaybableInterfaceTest {
    public static void main(String [] args){
        //delcare an array of Payable objects (generic container)
        Payable [] payableObjects = new Payable [4];
        
        //create the objects with concrete classes
        payableObjects[0]= new Invoice ("01234", "seat", 2, 375.00);
        payableObjects[1]= new Invoice ("56789", "tire", 4, 85.00);
        payableObjects[2]= new SalariedEmployee ("Mohamed", "Ali", "111-11-1111", 100.00);
        payableObjects[3]= new SalariedEmployee ("Ahmed", "Saleh", "222-13-1141", 200.00);
        
        List <Payable> payableList = new LinkedList<Payable>();
        payableList = Arrays.asList(payableObjects);
        System.out.printf("payableList: \n%s\n", payableList);
        //Collections.sort(payableList);
        System.out.printf("payableList: \n%s\n", payableList);
        
        System.out.println("Invoices and Employees processed using polymorphism:\n");
        
        //enhanced for statement
        for (Payable currentPayable : payableObjects){
            //print the payable object and its payable amount
            System.out.printf("%s %s %.2f\n\n", currentPayable.toString(), " payment due ", currentPayable.getPayment());
        }
        
    }
}