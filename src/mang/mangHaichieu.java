package mang;
import java.util.Scanner;
public class mangHaichieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong");
        int soDong = sc.nextInt();
        System.out.println("Nhap vao so Cot");
        int soCot = sc.nextInt();
        int arr[][] = new int[soDong][soCot];

        ////-------duyet mang ------\\\\\
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]= ");
                arr[i][j] = sc.nextInt();
            }
        }
        ////--------in ra---------\\\
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        /////--------tong cac phan tu mang-----\\\\

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("tong cua mang" + sum);

        /////----------gia tri lon nhat--------\\\\

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat mang la: " + max);

        /////---------gia tri nho nhat--------\\\\

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu nho nhat mang la: " + min);

        ////-----------tong duong cheo chinh ma tran vuong-----\\\\


        int tong = 0;
        if (soCot == soDong) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        tong = tong + arr[i][j];
                    }
                }
            }
            System.out.println("Tong cua duong cheo chinh la: "+ tong);

        }else{
            System.out.println("sai");
        }
    }
}