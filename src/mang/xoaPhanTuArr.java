package mang;
import java.util.Scanner;
public class xoaPhanTuArr {
    public static void main(String[] args) {
        Scanner mayQuet = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int soLuong = mayQuet.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = mayQuet.nextInt();
        }

        System.out.println("Nhập vào số cần tìm: ");
        int soCanTim = mayQuet.nextInt();
        System.out.println("Vị trí trong mảng là: "+timViTriPhanTu(arr, soCanTim));
        System.out.println("Nhập vào số cần xoá: ");
        int soCanXoa = mayQuet.nextInt();
        int viTriCanXoa = timViTriPhanTu(arr, soCanXoa);

        int[] newArr = new int[arr.length-1];
        for (int i=0; i<viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i=viTriCanXoa; i<arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }

        arr = newArr;
        inMang(arr);
    }

    static int timViTriPhanTu(int[] arr1, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] mang) {
        System.out.println("Mảng là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+"\t");
        }
    }
}
