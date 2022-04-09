package mang;
import java.util.Scanner;
public class gopMang {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,4,5};

        int []c=new int [a.length+b.length];

        for(int i=0;i< a.length;i++){
            a[i]=c[i];
        }
        for(int i=0;i< b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i< c.length;i++){
            System.out.println(c[i]);
        }
    }
}



