package huongDoiTuong.baitest;

import java.util.Scanner;

public class hcn {
    private Double width;
    private Double height;

    public hcn(double width, double height) { //Hàm constructer có tham số
        this.width = width; // Công nghệ mới
        this.height = height;
    }

    public hcn() { //Hàm constructer không tham số(phải truyền vào chỗ seter)

    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPemeter() {
        return 2 * (width + height);
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai hcn: ");
             double chieuDai = sc.nextDouble();
        System.out.println("Nhap chieu rong hcn");
            double chieuRong=sc.nextDouble();

            hcn a=new hcn(chieuRong, chieuDai);
        System.out.println(" Chu vi HCN la:" + a.getPemeter() );
        System.out.println("Dien tich HCN la: "+ a.getArea());
    }
  }



