package mang;
import java.util.Scanner;
public class GTNN {
    public static double minValue(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
      return min;
    }
    public static void main(String[] args) {
        int i;
        double min;
        System.out.println(" Nhap so phan tu trong mang");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double[]arr=new double[n];
        for( i=0;i< arr.length;i++){
            System.out.println("Nhap gia tri cau tung phan tu"+ (i+1));
            arr[i]= sc.nextDouble();
        }
        min=minValue(arr);
        System.out.println("Gia tri nho nhat la:"+ min);
    }
}
