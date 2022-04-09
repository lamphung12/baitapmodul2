package Mang12;

import java.util.Scanner;
public class tinhLaiSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so tien muon gui: ");
        double tienGui = sc.nextDouble();

        System.out.println("nhap lai suat ca nam: ");
        double lai = sc.nextDouble();

        System.out.println("nhap so thang gui: ");
        int thang = sc.nextInt();

        double tienLai =  tienGui * lai/12 *thang;
        System.out.println("tien lai la: " +tienLai);

    }
}
