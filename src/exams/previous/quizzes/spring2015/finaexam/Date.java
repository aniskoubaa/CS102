/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.spring2015.finaexam;

public class Date implements Comparable <Date>{
    
    private int day;
    private int month;
    private int year;
    
    private static final int [] dayPerMonth =
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date(int d, int m, int y){
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    
    public void setYear(int year){
        if((year>1950) && (year<2100))
            this.year=year;
        else
            throw new IllegalArgumentException("year must be 1950-2100");
    }
    
    public int getYear(){
        return year;
    }
    
    public void setMonth(int m){
        if ((m>0)&&(m<=12))
            month = m;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }
    public int getMonth(){
        return month;
    }
    
    public void setDay(int d){
        if ((d>0)&&(d<=dayPerMonth[month]))
            day = d;
        //for leap year
        else
        if ((month==2) && (d==29)&&(year%400==0 || year%4==0 && year%100!=0))
            day = d;
        else
            throw new IllegalArgumentException("day is out of range"); 
    }
    
    public int getDay(){
        return day;
    }
    
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
    
    @Override
    public int compareTo(Date D) {
        if (this.year!=D.year)
            return (this.year-D.year);
        if (this.month!=D.month)
            return (this.month-D.month);
        return (this.day-D.day);
    }
    
}
