package mang;
import java.util.Scanner;
public class timGiaTriMang {
    public static int KiemTra(String[] mang, String ten) {
        for (int i=0; i< mang.length;i++) {
            if (mang[i].equals(ten)) {
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        String[]mang={ "Long","Huy","Trung","Duy","Anh"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem");
        String ten=sc.nextLine();
        int Tim=KiemTra(mang,ten);
        if(Tim== -1){
            System.out.println("ko thay");
        }else {
            System.out.println("vi tri"+Tim);
        }

    }
}
