package huongDoiTuong.TangKichThuoc;

public class Rectangle extends KhoiVe {
    public double cd;
    public double cr;
////GET SET///
    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public Rectangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public Rectangle(String color, boolean filled, double cd, double cr) {
        super(color, filled);
        this.cd = cd;
        this.cr = cr;
    }

    public Rectangle() {
    }

    public double dTich(double cd,double cr){
        return this.cd*this.cr;
    }
    public double cVi(double cd,double cr){
        return (this.cd+this.cr)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "diện tích= "+ dTich(cd,cr)
                + "chu vi =" + cVi(cd,cr)
                + "cd=" + cd
                + ", cr=" + cr
                + ","+ super.toString() + '}';
    }
    @Override
    public void resize(double percent) {
        this.cd = (this.cd * (percent/100));
        this.cr = (this.cr * (percent/100));
    }

}
