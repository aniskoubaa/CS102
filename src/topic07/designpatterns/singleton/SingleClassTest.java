package topic07.designpatterns.singleton;


public class SingleClassTest {
   
    public static void main(String []args){
        
        SingleClass object1 = SingleClass.getInstance();//new SingleClass();
        SingleClass object2 = SingleClass.getInstance();//new SingleClass();
        
        object1.display(); // 0 1
        object2.display(); // 0 1
        System.out.println(object1.equals(object2)); //true
        
        object1.incrementCount();
        object1.display();// 1 1
        object2.display();// 1 1
        
        
    }
    
}
