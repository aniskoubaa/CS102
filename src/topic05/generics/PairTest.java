
package topic05.generics;


public class PairTest {
    public static void main(String []args){
        
        Pair<String, Student> ps = 
                new Pair<String, Student>("First Element", new Student());
        
        Pair<String, Integer> ss = new Pair<String, Integer>();
        
        Pair<Vertex, Integer> vertexDegreePair = 
                new Pair<Vertex, Integer>();
        
        vertexDegreePair.setFirst(new Vertex(0,"V0"));
        vertexDegreePair.setSecond(3);
        
        System.out.println(vertexDegreePair);
    
    }
    
}
