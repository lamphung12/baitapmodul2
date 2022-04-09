package huongDoiTuong;

import java.util.Scanner;

public class fanTo {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;
    private int speed ;
    private boolean on ;
    private double radius ;
    private String Color ;

    public fanTo() {
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.Color="blue";
    }

//    public fanTo(int speed, boolean on, double radius, String color) {
//        this.speed = speed;
//        this.on = on;
//        this.radius = radius;
//        Color = color;
//    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        if(this.on){
            return "fanTo1{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", Color='" + Color + '\'' + "fan is on"+
                    '}';
        }else{
            return "fanTo2{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", Color='" + Color + '\'' + "fan is off"+
                    '}';
        }
    }

    public static void main(String[] args) {
      fanTo fan1=new fanTo();

      fanTo fan2=new fanTo();
      fan2.setOn(true);
      fan2.setColor("blue");
      fan2.setRadius(5);
      fan2.setSpeed(2);
      System.out.println(fan1);
      System.out.println(fan2);
    }
}
