/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.quiz2;

public class HospitalTest {
    public static void main(String []args){
        
/*
[PA12345678] Mohamed Ahmed Address: 10 Olya Street, Morsalat Quarter, Riyadh, Saudi Arabia 
 Mobile: 966-05-47896511, Home: 966-011-49173511 null

[EM1245785D] Ahmed Nassir Address: 20 Sfax Street, Izdihar Quarter, Riyadh, Saudi Arabia
 Mobile: 966-05-47898711, Home: 966-011-4774131
*/
        Phone phoneHome = new Phone("966", "011", "4774131");
        Phone phoneMobile = new Phone("966", "05", "47898711");
        
        Street street = new Street(10, "Olya Street","Morsalat Quarter" ); 
        Address address = new Address(street, "Riyadh", "KSA");
        Contact contact = new Contact(address, phoneMobile, phoneHome);
        
        Patient p = new Patient("Mohamed", "Ahmed", contact,
        "PA12345678", null);
        
       Patient patient = 
       new Patient("Mohamed",
       "Ahmed", new Contact(
               new Address(
                       new Street(10, "Olya Street","Morsalat Quarter" ), "Riyadh", "KSA"), 
               new Phone("11", "12344", "2345"),
               new Phone("11", "12344", "2345")), 
               "PA12345678", null);
      
    }
    
}
