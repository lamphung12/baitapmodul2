package mang;
import java.util.Scanner;
public class chuyenDoiNhietDo {
    public static double C_F(double C) {
        double F;
        F = (9/5)*C +32;
        return F;
    }
    public static double F_C(double F) {
        double C;
        C = (5/9)*(F-32);
        return C;
    }

    public static void main(String[] args) {
        int chon;
        double C;
        double F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("0 - Exit");
        System.out.println("1 - Chuyen doi C - F");
        System.out.println("2 - Chuyen doi F - C");
        System.out.println(" Moi lua chon");
        chon= Integer.parseInt(sc.nextLine());
        if(chon ==1){
            System.out.println(" Nhap nhiet do C");
            C=sc.nextDouble();
            double tinh=C_F(C);
            System.out.println("Ket qua chuyen doi C_F la:"+ tinh);
        }
        if(chon==2){
            System.out.println("Nhap nhiet do F");
            F= sc.nextInt();
            double tinh2=F_C(F);
            System.out.println("Ket qua chuyen doi F_C la: "+ tinh2);
        }
    }
}
