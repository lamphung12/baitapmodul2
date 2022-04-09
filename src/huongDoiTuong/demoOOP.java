package huongDoiTuong;
import java.util.Scanner;
public class demoOOP {
    String mieuTa= "mat hang nay rat dep";
    double giaGoc=100;
    double giaSale=80;

    public static void main(String[] args) {
        demoOOP sc=new demoOOP();
        String des= sc.mieuTa;
        double price=sc.giaGoc;
        double price1=sc.giaSale;
        System.out.println(des);
        System.out.println(price);
        System.out.println(price1);
        sc.mieuTa="Mat hang nay rat xau";
        sc.giaGoc=150;
        sc.giaSale=120;
        System.out.println(sc.mieuTa);
        System.out.println(sc.giaGoc);
        System.out.println(sc.giaSale);

    }
}
