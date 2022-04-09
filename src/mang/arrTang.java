package mang;
import java.util.Scanner;
public class arrTang {
    public static void main(String[] args) {
        System.out.println("Nhap so phaan u trong mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" gia tri cua phan tu: " + (i + 1));
            arr[i] = sc.nextDouble();
        }
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Kết quả sau khi được sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
