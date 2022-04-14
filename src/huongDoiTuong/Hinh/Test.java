package huongDoiTuong.Hinh;

public class Test {
    public static void main(String[] args) {
        toaDo td1 = new toaDo(2,5);
        toaDo td2 = new toaDo(1,7);
        toaDo td3 = new toaDo(6,8);


        hinh h2=new HinhTron(td2,5);
        hinh h3=new HinhChuNhat(td3,5,7);


        System.out.println("DT hinh tron"+h2.tinhDienTich());
        System.out.println("DT hinh CN:"+h3.tinhDienTich());


    }
}
