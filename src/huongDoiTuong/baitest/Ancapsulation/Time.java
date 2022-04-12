package huongDoiTuong.baitest.Ancapsulation;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setTime(int hour, int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void previousSecond(){
        if(hour ==0 && minute ==0 && second ==0 ){
            hour=23;
            minute=59;
            second=59;
             return;
        }
        if(minute==0 && second ==0){
            hour--;
            minute=59;
            second=59;
            return;
        }
        if(second==0){
            minute--;
            second=59;
            return;

        }
        second--;
    }
    public void nextSecond(){
        if(hour ==23 && minute ==59 && second ==59 ){
            hour=0;
            minute=0;
            second=0;
            return;
        }
        if(minute==59 && second ==59){
            hour++;
            minute=0;
            second=0;
            return;

        }
        if(second==59){
            minute++;
            second=0;
            return;

        }
        second++;
    }
     public void display(){
        if( hour >= 0 && minute>=0 && second>=0){
            System.out.println("Time: " +
                     hour +":"+
                     minute +":"+
                    second );

        }
     }
    public static void main(String[]args){
        Time ti = new Time(3,59,20);
        ti.display();
        ti.setTime(-3,-56,7);
        ti.nextSecond();
        ti.display();

       ti.setHour(2);
       ti.setMinute(0);
       ti.setSecond(0);
       ti.getHour();
       ti.getMinute();
       ti.getSecond();
        ti.previousSecond();
        ti.display();
    }
}
