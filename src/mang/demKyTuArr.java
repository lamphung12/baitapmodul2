package mang;
import java.util.Scanner;
public class demKyTuArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        int count =0;
        char kytu;
        System.out.println("Nhap chuoi can kiem tra");
            chuoi=sc.nextLine();
        System.out.println("Nhap ky tu can kiem tra");
            kytu=sc.next().charAt(0);
            for(int i=0;i<chuoi.length();i++){
                if(chuoi.charAt(i)==kytu){
                    count++;
                }
            }
        System.out.println("So phan tu trong chuoi la:"+ count);
    }
}
