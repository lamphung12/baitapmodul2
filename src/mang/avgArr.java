package mang;
import java.util.Scanner;
public class avgArr {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang");
         Scanner sc=new Scanner(System.in);
          int n= sc.nextInt();
//          --------Tạo xem trong mảng có  bao nhiêu phần tử------------
       double[]arr=new double[n];
         double tinh=0;
       for( int i=0;i<n;i++){
           System.out.println("Nhap gia tri" + (i+1)+"của mảng");
           arr[i]=sc.nextDouble();
//           -------Nhập số thứ tự các phần tử trong mảng------
       }
       for(int i=0;i< arr.length;i++ ){
           tinh=tinh+arr[i];
       }
       double avage=tinh/ arr.length;
        System.out.println("Trung binh cua day la : "+ avage);
    }
}
