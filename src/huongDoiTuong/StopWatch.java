package huongDoiTuong;

import java.util.Scanner;

public class StopWatch {
    private long  startTime;
    private long  endTime;

    public long getStartTime(){
        return startTime;      ////phương thức getter để trả về giá trị của startTime\\\
    }
    public long getEndTime(){
        return endTime;        ////phương thức getter để trả về giá trị của endTime\\\
    }

    public void startTime() {
    }           ///////////phuong thuc khoi tao ko tham so\\\\\\

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    /////Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.

    public void stop(){
     this.endTime=System.currentTimeMillis();
    }
//    Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.

    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
//    Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

    public static void main(String[] args) {
        StopWatch sw=new StopWatch();
        sw.getStartTime();
        sw.getEndTime();

    }
}
