package mang;
import java.util.Scanner;
public class GTLNarr {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[]arr=new double[n];
        for(int i=0;i< arr.length;i++){
            System.out.println("Gia tri cua phan tu "+(i+1));
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        for(int i=0;i< arr.length;i++){
           if(arr[i]>max){
             max=arr[i];
           }
        }
        System.out.println("Gia tri lon nhat mang: "+ max );
    }
}
