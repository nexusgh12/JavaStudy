package Homework.Day5;

//과제5부터의 내용입니다.

//과제5)
class Time {
    private int hour;
    private int minute;
    private int second;

    //생성자 생성
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

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

     public void print(){
        System.out.printf("현재 시간은 %d시 %d분 %d초 입니다.", getHour(), getMinute(), getSecond());
    }
}




public class Assignment2 {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        t.print();
    }
}
