package Mang12;

import java.util.Scanner;
public class sntDau {
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
                int count=0;
                for(int i=0;i<20;i++){
                    if(check(i) == true){
                        count++;
                        System.out.println(i);
                    }
                }
    }
}
//    Scanner so= new Scanner(System.in);
//        System.out.println("Nhap vao 1 so");
//         int n =so.nextInt();
//        if(check(n)){
//            System.out.println( n+" La so nguyen to");
//        }else{
//            System.out.println(n+" Ko phai so nguyen to");
//        }
//        so.close();
