package exams.quizzes.spring2016.major02solution.impl;

import exams.quizzes.spring2016.major02.interfaces.EdgeFactory;
import exams.quizzes.spring2016.major02.interfaces.IGraph;
import exams.quizzes.spring2016.major02.interfaces.VertexFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FacebookGraph 
implements IGraph<FacebookUser, FriendshipRelation> {
    
    private Set<FacebookUser> users=new HashSet<FacebookUser>();
    private Set<FriendshipRelation> relations=new HashSet<FriendshipRelation>();

    private FacebookRelationFactory facebookRelationFactory = new FacebookRelationFactory();
    private FacebookUserFactory facebookUserFactory = new FacebookUserFactory();
    
    public boolean addUser(FacebookUser user){
        return users.add(user);
    }
    
    private static FacebookGraph instance = new FacebookGraph();
    private FacebookGraph(){ 
    }
    public static FacebookGraph getInstance(){
        return instance;
    }
    
    /** question 02 **/
    public boolean addUser(int id, String name, String email){
        FacebookUser user = (FacebookUser)getVertexFactory().create(id,name);
        user.setEmail(email);
        //System.out.println(user);
        return users.add(user);
    }
    
    public Set<FacebookUser> getUsers(){
        return getVertices();
    }
    
    public Set<FriendshipRelation> getRelations(){
        return getEdges();
    }
    
    
    /** question 03 **/
    public FacebookUser getUser (int userID){
        Iterator <FacebookUser>it = users.iterator();
        while (it.hasNext()){
            FacebookUser u = it.next();
            if (u.getID()==userID)
                return u;
        }
        return null;
    }
    /** question 04 **/
    public boolean addFriend(FacebookUser user1, FacebookUser user2){
        return relations.add(facebookRelationFactory.create(user1, user2));
        //return relations.add(new FriendshipRelation(user1, user2));
    }
    
    public boolean addFriend(int userID1, int userID2){
        FacebookUser user1, user2;
        user1 = getUser(userID1);
        user2 = getUser(userID2);
        return relations.add(facebookRelationFactory.create(user1, user2));
        //return relations.add(new FriendshipRelation(user1, user2));
    }
    
    @Override
    public Set<FacebookUser> getVertices() {
        return users;
    }

    @Override
    public Set<FriendshipRelation> getEdges() {
        return relations;
    }

    @Override
    public void setVertices(Set<FacebookUser> vertices) {
        users= vertices;
    }

    @Override
    public void setEdges(Set<FriendshipRelation> edges) {
        relations = edges;
    }

    @Override
    public void addVertex(FacebookUser v) {
        users.add(v);
    }

    @Override
    public void addEdge(FriendshipRelation v) {
        relations.add(v);
    }

    @Override
    public FriendshipRelation addEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        FriendshipRelation fr = facebookRelationFactory.create(sourceVertex, targetVertex);
        relations.add(fr);
        return fr;
    }

    @Override
    public boolean containsEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        Iterator <FriendshipRelation> it = relations.iterator();
        while (it.hasNext()){
            FriendshipRelation fr = it.next();
            boolean c1 = (fr.getSource().equals(sourceVertex));
            boolean c2 = (fr.getTarget().equals(targetVertex));
           
            if (c1 && c2)
                return true;
            
        }
        return false;
    }
    
    public boolean areFriends(FacebookUser sourceVertex, FacebookUser targetVertex){
        return (containsEdge(sourceVertex, targetVertex)||containsEdge(targetVertex,sourceVertex));
    }

    

    @Override
    public void printToFile(String fileName) {
        
    }

    @Override
    public void loadFromFile(String fileName) {
        
    }

    @Override
    public EdgeFactory getEdgeFactory() {
        return facebookRelationFactory;
    }
    
    @Override
    public VertexFactory getVertexFactory() {
        return facebookUserFactory;
    }
    
    
    
    public Map <Integer, String> getFriendMap(){
        Map <Integer, String> friendMap = new TreeMap<Integer, String>();
        
        for (FriendshipRelation r : relations){
            if (friendMap.containsKey(r.getSource().getID())){
                String s = friendMap.get(r.getSource().getID());
                friendMap.put(r.getSource().getID(),(s+";"+ r.getTarget().getID()));
            }else{
                String s = "";
                friendMap.put(r.getSource().getID(),(s+ r.getTarget().getID()));
            }
            if (friendMap.containsKey(r.getTarget().getID())){
                String s = friendMap.get(r.getTarget().getID());
                friendMap.put(r.getTarget().getID(),(s+";"+ r.getSource().getID()));
            }else{
                String s = "";
                friendMap.put(r.getTarget().getID(),(s+ r.getSource().getID()));
            }
        }
        return friendMap;
    }
    
    public Map <Integer, Friends> getFriendsMap(){
        Map <Integer, Friends> friendMap = new TreeMap<Integer, Friends>();
        
        for (FriendshipRelation r : relations){
            int userID = r.getSource().getID();
            int friendID = r.getTarget().getID();
            if (friendMap.containsKey(userID)){
                Friends friendsOfUser = friendMap.get(userID);
                friendsOfUser.add(friendID);
                friendMap.put(userID,friendsOfUser);
            }else{
                Friends friendsOfUser = new Friends();
                friendsOfUser.add(friendID);
                friendMap.put(userID,friendsOfUser);
            }
            if (friendMap.containsKey(r.getTarget().getID())){
                Friends s = friendMap.get(r.getTarget().getID());
                s.add(r.getSource().getID());
                friendMap.put(r.getTarget().getID(),s);
            }else{
                Friends s = new Friends();
                s.add(r.getSource().getID());
                friendMap.put(r.getTarget().getID(),s);
            }
        }
        return friendMap;
    }
    
    public void loadGraph(String fileName) throws FileNotFoundException {
        
        Scanner fileInput = new Scanner(new File(fileName));
        
        //read first line
        int nbUsers = Integer.parseInt(fileInput.nextLine());
        System.out.println("nbUsers: "+nbUsers);
        for (int i=0;i<nbUsers;i++){
            if (fileInput.hasNext()){
            //2;Kamal;kamal@gmail.com
            String userLine = fileInput.nextLine();
            String [] userInfo = userLine.split(";");
            int id = Integer.parseInt(userInfo[0]);
            String name = userInfo[1];
            String email = userInfo[2];
            FacebookUser fbu=(FacebookUser)this.facebookUserFactory.create(id, name);
            fbu.setEmail(email);
            this.users.add(fbu);  
            }else return;
        }
        for (int i=0;i<nbUsers;i++){
            if (fileInput.hasNext()){
            //1:3;5;4
            String relationLine = fileInput.nextLine();
            //System.out.println("relationLine: "+relationLine);
            String [] userFriends = relationLine.split(":");
            //  System.out.println("userFriends[0]: "+userFriends[0]);
            int userID = Integer.parseInt(userFriends[0]);
            String [] friends = userFriends[1].split(";");
            for (int j=0;j<friends.length;j++){
                int friendID = Integer.parseInt(friends[j]);
                FriendshipRelation relation = 
        (FriendshipRelation) this.facebookRelationFactory.create(getUser(userID), getUser(friendID));
                this.relations.add(relation);
            }
            
            }else return;
        }
        
    }
    
    public String toString(){
        String s="";
        s=s+this.users.size()+"\n";
        for (FacebookUser u : users){
            s=s+u.toString()+"\n";
        }
        
        Set <Integer> idSet = getFriendsMap().keySet();
        for (Integer id : idSet){
            s= s + id+":"+getFriendsMap().get(id)+"\n";
        }
        return s;        
    }

    
}
