package huongDoiTuong.Hinh;

public abstract class hinh {
    protected toaDo toado ;

    public hinh(toaDo toado) {
        this.toado = toado;
    }
///get va set
    public toaDo getToado() {
        return toado;
    }

    public void setToado(toaDo toado) {
        this.toado = toado;
    }
public abstract double tinhDienTich();
}
