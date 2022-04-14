package huongDoiTuong.QuanLySinhVien;

public class Teacher extends SinhVien implements Comparable<Teacher>{
    private double TienLuong;
    private int ThoiGianDay;

    public Teacher() {
    }


    public Teacher(String name, int id, int age, String address, double tienLuong, int thoiGianDay) {
        super(name, id, age, address);
        TienLuong = tienLuong;
        ThoiGianDay = thoiGianDay;
    }
////get va set///
    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double tienLuong) {
        TienLuong = tienLuong;
    }

    public int getThoiGianDay() {
        return ThoiGianDay;
    }

    public void setThoiGianDay(int thoiGianDay) {
        ThoiGianDay = thoiGianDay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " Name " + getName() +
                " Id " + getId() +
                " tuoi " + getAge() +
                " Address " + getAddress() +
                " TienLuong = " + TienLuong +
                ", ThoiGianDay = " + ThoiGianDay +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return (int) (this.TienLuong - o.TienLuong);
    }
}
