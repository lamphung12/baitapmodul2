package mang;
import java.util.Scanner;
public class themPhanTuArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a={5,7,8,9,10};
        int[] b =new int[6];
        for (int i = 0; i < a.length; i++) {
            if(i<6){
                b[i]=a[i];
            }
            b[5]=15;
        }

        System.out.println("\nArray after adding element is: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] +" ");
        }


    }
}
