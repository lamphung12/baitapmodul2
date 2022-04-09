package huongDoiTuong;

import java.util.Scanner;

public class student {
    private String name;
    private int age;
    private String cmt;

//      public student(String cmt, String name, int age){
//          this.name=name;
//          this.cmt=cmt;
//          this.age=age;
//
//      }
//      public student(){
//      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
}
class Main{
    public static void main(String[] args) {
        student hocsinh = new student();
        hocsinh.setCmt("21214687");
        hocsinh.setName("Nam");
        hocsinh.setAge(20);
        System.out.println(hocsinh.getCmt());
        System.out.println(hocsinh.getAge());
        System.out.println(hocsinh.getName());

    }
}



