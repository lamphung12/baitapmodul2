package huongDoiTuong;

import java.util.Scanner;

public class phuongTrinhBac2 {
    private double a;
    private double b;
    private double c;


    public phuongTrinhBac2() {
    }

    public phuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double getRoot1 = ((-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
        return getRoot1;

    }

    public double getRoot2() {
        double getRoot2 = ((-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a));
        return getRoot2;
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.println("Nghiem 1: " + getRoot1() + "Nghiem 2: " + getRoot2());
        } else if (getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (getDiscriminant() == 0) {
            System.out.println("Nghiem 1 = Ngiem 2 la:" + getRoot1());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a");
        double a1 = sc.nextDouble();
        System.out.println("Nhap gia tri b");
        double b1 = sc.nextDouble();
        System.out.println("Nhap gia tri c");
        double c1 = sc.nextDouble();

        phuongTrinhBac2 pt = new phuongTrinhBac2(a1, b1, c1);
        pt.display();
    }
}
