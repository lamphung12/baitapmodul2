package huongDoiTuong.ArrList;

public class Teacher extends Student{
    private int TienLuong;
    private int GioLamViec;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, int tienLuong, int gioLamViec) {
        super(id, name, age);
        TienLuong = tienLuong;
        GioLamViec = gioLamViec;
    }
///get va set///
    public int getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(int tienLuong) {
        TienLuong = tienLuong;
    }

    public int getGioLamViec() {
        return GioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        GioLamViec = gioLamViec;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id"+getId()+
                "Name"+getName()+
                "Age"+getAge()+
                "TienLuong=" + TienLuong +
                ", GioLamViec=" + GioLamViec +
                '}';
    }
}
