/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quizzes.spring2016.finalexam.impl;

import java.io.FileNotFoundException;

/**
 *
 * @author akoubaa
 */
public class GraphTest {
    public static void main(String [] args) throws FileNotFoundException{
        
        FacebookGraphAnalysis <FacebookGraph ,FacebookUser,FacebookRelation> fga = new FacebookGraphAnalysis <FacebookGraph ,FacebookUser,FacebookRelation>();
        
        FacebookGraph fbg= FacebookGraph.getInstance();
        //System.out.println(fbg);
        fbg.loadGraph("dir/fbgraph.txt");
        System.out.println(fbg);
        System.out.println();
        System.out.printf("The most popular user is %s with %d friends \n", fga.GetMostPopularUser(fbg).getKey().getName(), fga.GetMostPopularUser(fbg).getValue());
        FacebookUser u = fbg.getUsers().iterator().next();
        System.out.println();System.out.println();
        System.out.println("We consider the user "+  u);
        System.out.println();
        System.out.printf("The friends of %s are: %s \n",  u.getName(), fga.GetFriends(fbg, u));
        System.out.println();
        System.out.printf("The number of friends of the user %s is: %d\n" , u.getName(), fga.getNumberOfFriends(fbg, u));
        System.out.println();
        System.out.printf("The most popular friend for the user [%s] is [%s] who has [%d] friends \n" , u.getName(), fga.GetTheMostPopularFriend(fbg, u).getKey().getName(), fga.GetTheMostPopularFriend(fbg, u).getValue());
        System.out.println();
        System.out.println("The users who have gmail accounts are: "+ fga.search(fbg, "gmail"));
        System.out.println();
        System.out.println("The users who have yahoo accounts are: " + fga.search(fbg, "yahoo"));
        System.out.println();
        System.out.println(fga.search(fbg, "kass"));
    }
    
}
