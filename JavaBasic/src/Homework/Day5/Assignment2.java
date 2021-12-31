package Homework.Day5;

//과제5부터의 내용입니다.

//과제5)
class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour(){ return hour; }
    
    public void setHour(int hour){
        if(hour < 0 || hour > 23)
            this.hour = hour;
    }

    public int getMinute(){return minute;}

    public void setMinute(int minute){
        if(minute < 0 || minute > 60)
            this.minute = minute;
    }

    public int getSecond(){return second;}

    public void setSecond(int second){
        if(second < 0 || second > 60)
            this.second = second;
    }

}




public class Assignment2 {
    public static void main(String[] args) {
        Time t = new Time();


    }
}
