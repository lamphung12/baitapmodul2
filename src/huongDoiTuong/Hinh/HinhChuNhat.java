package huongDoiTuong.Hinh;

public class HinhChuNhat extends hinh{
     private double chieuDai;
     private double chieuRong;

    public HinhChuNhat(toaDo toado) {
        super(toado);
    }

    @Override
    public double tinhDienTich() {
        return chieuDai*chieuRong;
    }

    public HinhChuNhat(toaDo toado, double chieuDai, double chieuRong) {
        super(toado);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
/////get va set
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

}
