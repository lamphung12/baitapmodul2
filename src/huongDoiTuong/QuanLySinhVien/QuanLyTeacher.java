package huongDoiTuong.QuanLySinhVien;

import huongDoiTuong.QuanLy.QuanlyXeMay;

import java.sql.Array;
import java.util.Arrays;

public class QuanLyTeacher implements QuanLy<Teacher> {
    private Teacher[] danhSach = new Teacher[3];
    private int size = 0;

    @Override
    public void them(Teacher teacher) {
        danhSach[size] = teacher;
        size++;
    }

    @Override
    public void sua(String name, Teacher teacher) {
             danhSach[timKiem(name)]= teacher;
    }

    @Override
    public void xoa(String name, Teacher teacher) {
         danhSach[timKiem(name)]=null;
    }

    @Override
    public int timKiem(String name) {
        for(int i=0;i<size;i++){
            if(name == danhSach[i].getName()){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------");
    }


    public static void main(String[] args) {
        QuanLyTeacher te =new QuanLyTeacher();
        Teacher te1 =new Teacher("Cong",1111,30,"Ha Noi",1000,10);
        Teacher te2 =new Teacher("Con",1211,20,"Tp HCM",200,12);
        Teacher te3 =new Teacher("Con123",1211,20,"Tp HCM",200,12);

        te.them(te1);
        te.them(te2);
        te.them(te3);
        te.display();

       ////tim theo ten hien thi vij tris///
        System.out.println(te.timKiem("Cong"));
        //////sua ---//
        Teacher te4 =new Teacher("Con1",1211,20,"Tp HCM",500,12);
          te.sua("Con",te4);
          te.display();
          ////////xoa---////
//        Teacher te5 =new Teacher("Congggg",1211,20,"Tp HCM",300,12);
//          te.xoa("Congggg",te4);
//          te.display();
        /////sap xep theo tien luong tu thap toi cao///
         te.sapXep();
         te.display();

    }
}