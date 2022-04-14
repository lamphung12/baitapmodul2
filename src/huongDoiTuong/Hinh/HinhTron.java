package huongDoiTuong.Hinh;

public class HinhTron extends hinh{
    private double r;
    public HinhTron(toaDo toado) {
        super(toado);
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r*r;
    }

    public HinhTron(toaDo toado, double r) {
        super(toado);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
