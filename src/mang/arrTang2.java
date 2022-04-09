package mang;
import java.util.Scanner;
public class arrTang2 {
    public Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[]arr=new double[5];
        for(int i=0;i< arr.length;i++){
            System.out.println(" gia tri cua phan tu: "+(i+1));
            arr[i]= sc.nextDouble();
        }
        dKien(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
    }
    public static void dKien(double[] arr){
        int temp = (int) arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = (int) arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(double[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
