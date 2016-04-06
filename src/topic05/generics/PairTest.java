
package topic05.generics;

import java.util.ArrayList;


public class PairTest {
    
    public static void main(String []args){
        
        Pair <Integer> pair = new Pair<Integer>();
        pair.setFirst(1);
        pair.setSecond(2);
        
        //PairDouble paird = new PairDouble(1.2, 2.4);
        
        Pair<Double> pairdouble = new Pair<Double>(1.2, 3.5);
        //ArrayList <Double> l;
        pairdouble.setFirst(1.0);
        
        Pair <Student> studentPair = new Pair<Student>();
        studentPair.setFirst(new Student());
        //studentPair.setFirst(1);
        
        
        Pair<Vertex> edge = new Pair<Vertex> ();
        
        
        KeyValuePair<Integer, String> idname = 
                new KeyValuePair<Integer, String>();
        
        idname.setKey(1);
        idname.setValue("Mohamed");
        
        System.out.println(idname);
        
        KeyValuePair<Vertex, Integer> vertexdegree = 
                new KeyValuePair<Vertex, Integer>();
        vertexdegree.setKey(new Vertex(0,"V0"));
        vertexdegree.setValue(3);
        
        System.out.println(vertexdegree);
        
        ArrayList<Pair> list=
                new ArrayList<Pair>();
        
        
        ArrayList<KeyValuePair<String, Integer>> list2=
                new ArrayList<KeyValuePair<String, Integer>>();
        
    }
    
}
