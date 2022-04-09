package mang;
import java.util.Scanner;
public class daoNguoc {
    public static void main(String[] args) {
        int i=0;

        double temp=0;
//     -----------   Ham tao mang   ---------------
        System.out.println(" Nhap so phan tu trong mang");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double[]arr=new double[n];
        for( i=0;i< arr.length;i++){
            System.out.println("Nhap gia tri cau tung phan tu"+ (i+1));
            arr[i]= sc.nextDouble();
        }

        for(i= arr.length-1;i>=0;i--){
            System.out.println("Mang sau khi dao nguoc");
            System.out.print(arr[i]+ "  ");
        }

    }
}

