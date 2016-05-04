/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.major02solution.impl;

import java.io.FileNotFoundException;

/**
 *
 * @author akoubaa
 */
public class GraphTest2 {
    public static void main(String [] args) throws FileNotFoundException{
        
        FacebookGraph fbg= FacebookGraph.getInstance();
        System.out.println(fbg);
        fbg.loadGraph("dir/fbgraph.txt");
        System.out.println(fbg);
        
        
    }
    
}
