package mang;
import java.util.Scanner;
public class demHocSinhDo {
    public static void main(String[] args) {
        Scanner mayQuet = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int soLuong = mayQuet.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao diem cua sinh vien " + i);
            arr[i] = mayQuet.nextInt();
        }
        int count=0;
        System.out.println("Danh sach diem nhap vao");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
             if(arr[i]>5 && arr[i]<=10){
                 count++;
             }
        }
        System.out.println("Dem so luong do trong mang"+ count);
    }
}
