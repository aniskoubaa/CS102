package exams.previous.quizzes.spring2015.quiz3;
public class MedicalReport implements Printable{
    
    private String content;
    private Doctor doctor;
    private Date date;
    private Time time;

    
    public MedicalReport(String content, Doctor doctor, Date date, Time time) {
        this.content = content;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }
    
    /*
    Content: content
Written by: Dr. firstName lastName
Date: date
Time: time

    */


    
    @Override
    public String printText(){
        return String.format("Content: %s\n"
                + "Written by: %s\n"
                + "Date: %s\n"
                + "Time: %s", this.getContent(),
                this.getDoctor().getDescription(), 
                this.getDate(),
                this.getTime());
    }
    /*
    {"content": "content", "doctor": "Dr. firstName lastName", 
    "Date": "date", "Time": "time"}
    */
    @Override
    public String printJson(){
        return String.format("{\"content\": \"%s\","
                + "\"doctor\": \"%s\", "
                + "\"Date\":\"%s\","
                + "\"Time\":\"%s\"}",
                this.getContent(),
                this.getDoctor().getDescription(),
                this.getDate(),
                this.getTime());
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }    
    
}
