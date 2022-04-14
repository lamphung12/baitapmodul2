package huongDoiTuong.QuanLy;

public class oTo extends phuongTien{
    private int soCho;

    public oTo() {
    }

    public oTo(String hang, String mau, String ten, int gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

}
