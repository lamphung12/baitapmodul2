package huongDoiTuong.baitest;

import java.util.Scanner;

public class teacher {
    String name;
    int age;
    double tienLuong;
    int ngayLamViec;

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tienLuong=" + tienLuong +
                ", ngayLamViec=" + ngayLamViec +
                '}';
    }

    public static void main(String[] args) {
        teacher tc=new teacher();
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap ten ");
        tc.name=sc.nextLine();

        System.out.println("Nhap tuoi");
        tc.age=Integer.parseInt(sc.nextLine());

        System.out.println("Nhap tien luong");
        tc.tienLuong=Double.parseDouble(sc.nextLine());

        System.out.println("Nhap so ngay lam viec");
        tc.ngayLamViec=Integer.parseInt(sc.nextLine());

        System.out.println(tc);
          double tatal=tc.ngayLamViec*tc.tienLuong;
        System.out.println("Tatal"+ tatal);

    }
}
