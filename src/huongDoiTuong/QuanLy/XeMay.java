package huongDoiTuong.QuanLy;

public class XeMay extends phuongTien implements Comparable<XeMay>{
    private int dungTich;

    public XeMay() {}

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return " xeMay{"+ " ten = " + getTen() +
                " gia = "+ getGia()+
                " dungTich = " + dungTich +
                '}';
    }

    @Override
    public int compareTo(XeMay o) {
       return this.dungTich-o.dungTich;
    }
}
