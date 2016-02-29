package exams.previous.quizzes.fall2014.quiz32;
import java.util.*;

public class Conference extends Publication{
    
    private String ConferenceName;
    private String ConferenceLocation;
    private String paperAbstract;
    private String paperContent;
    
      
    public Conference(){
        super();
    }
    
    public Conference (String title, ArrayList authorsList, 
            Date pubDate, String ConfName, 
            String ConfLocation, 
            String PAbstract, String content){
        super(title, authorsList, pubDate);
        setConferenceName(ConfName);
        setConferenceLocation(ConfLocation);
        setPaperAbstract(PAbstract);
        setPaperContent(content);
        
    }
    
    @Override
    public String readAbstract(){
        return paperAbstract;
    }
    @Override
    public String readContent(){
        return paperContent;
    }
    @Override
    public String readTitle(){
        return getTitle();
    }
    @Override
    public List<String> toArrayList(){
        List<String> list = new ArrayList<String>();
        list.add(getTitle());
        list.add(this.readAbstract());
        list.add(this.readContent());
        return list;
    }
    

    public String getPaperAbstract() {
        return paperAbstract;
    }

    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

    public String getPaperContent() {
        return paperContent;
    }

    public void setPaperContent(String paperContent) {
        this.paperContent = paperContent;
    }
    
    
    
    public void setConferenceName(String ConfName){
        ConferenceName = ConfName;
    }
    
    public void setConferenceLocation(String ConfLocation){
        ConferenceLocation = ConfLocation;
    }
    
    public String getConferenceName(){
        return ConferenceName;
    }
    
    public String getConferenceLocation(){
        return ConferenceLocation;
    }  
    
    public String toString(){
        String str = super.toString();
        return String.format("%s, %s, %s.", super.toString(), getConferenceName(), getConferenceLocation());
    }
    
    
    
}
