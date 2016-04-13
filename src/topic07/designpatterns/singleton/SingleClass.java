
package topic07.designpatterns.singleton;


public class SingleClass {
    
    private int count;
    private int nbrObjects=0;
    
    private static SingleClass instance=new SingleClass();
   
    
    public static SingleClass getInstance(){
        if (instance==null)
            instance = new SingleClass();
        return instance;
    }
    
    private SingleClass(){
        nbrObjects++;
    }
    
    public void incrementCount(){
        count++;
    }
    
    public void display(){
        System.out.println("count: "+count);
        System.out.println("nbrObjects: "+ nbrObjects);
    }
    
    
}
