package Mang12;

import java.util.Scanner;
public class sntNho100 {
    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (check(i) == true) {
                count++;
                System.out.println(i);
            }
        }
    }
}
//}
//    Scanner sc= new Scanner(System.in);
//        System.out.println("Nhap so nguyen to dau tien");
//                int n= sc.nextInt();
//                int count=0;
//                for(int i=0;count<n;i++){
//        if(check(i) == true){
//        count++;
//        System.out.println(i);
//        }
//        }


