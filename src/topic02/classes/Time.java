package topic02.classes;

public class Time implements Comparable<Time>{
    
    private int hour; //0-23
    private int minute;//0-59
    private int second;//0-59
    
    public Time(int hour, int minute, int second){
        this.setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    public Time(){
        this(0,0,0);        
    }
    
    public Time(int hour, int minute){
        this(hour, minute,0);
        
    }
    
    public Time(int hour){
        this(hour,0,0);
    }
    
    
    //copy a constructor: it allows to copy an object in another one
    public Time(Time t){
        //hour= t.getHour();
        //this.minute = t.minute;
        //this.second = t.second;
        this(t.getHour(), t.getMinute(), t.getSecond());
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setHour(int hour){
        if ((hour>=0)&&(hour<24)){
            this.hour=hour;
        }else
            throw new IllegalArgumentException("Hour format is not correct");
    }
    
    public void setMinute(int minute){
        if ((minute>=0)&&(minute<60)){
            this.minute=minute;
        }else
            throw new IllegalArgumentException("Minute format is not correct");
    }
    
    public void setSecond(int second){
        if ((second>=0)&&(second<60)){
            this.second=second;
        }else
            throw new IllegalArgumentException("Second format is not correct");
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toStandardString(){
        
        String AM_PM = "AM";
        int h=hour;
        if (hour==0){
            h = 12;
            AM_PM = "AM";
        }
        else if (hour==12){  
            AM_PM = "PM";
        }
        else if ((hour>12)&&(hour<=23)){
            h = hour%12;
            AM_PM = "PM";
        }
        return String.format("%d:%02d:%02d %s", h, minute, second, AM_PM);
    }
    @Override
    public int compareTo(Time t){
        if (this.getHour()!=t.getHour()){
            return this.getHour()-t.getHour();
        }else 
            if (this.getMinute()!=t.getMinute()){
            return this.getMinute()-t.getMinute();
        }
        return this.getSecond()-t.getSecond();
        /*if (this.getHour()>t.getHour()){
            return 1;
        }else if (this.getHour()<t.getHour()){
            return -1;
        }else if (this.getMinute()>t.getMinute()){
            return 1;
        }else if (this.getMinute()<t.getMinute()){
            return -1;
        }else if (this.getSecond()>t.getSecond()){
            return 1;
        }else if (this.getMinute()<t.getMinute()){
            return -1;
        }
        else return 0;
        */
    }
    
    
    
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
}
/*
@Override
    public int compareTo(Time t){
        
        if (this.getHour()!=t.getHour()){
            return this.getHour()-t.getHour();
        }else if (this.getMinute()!=t.getMinute()){
            return this.getMinute()-t.getMinute();
        }
        return this.getSecond()-t.getSecond();
        
        /*
        if (this.getHour()>t.getHour()){
            return 1;
        }else if (this.getHour()<t.getHour()){
            return -1;
        }
        else
            if (this.getMinute()>t.getMinute()){
            return 1;
        }else if (this.getMinute()<t.getMinute()){
            return -1;
        }
        else
            if (this.getSecond()>t.getSecond()){
            return 1;
        }else if (this.getSecond()<t.getSecond()){
            return -1;
        }
        else return 0;
                
    }
*/