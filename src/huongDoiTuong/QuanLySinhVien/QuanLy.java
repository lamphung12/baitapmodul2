package huongDoiTuong.QuanLySinhVien;


public interface QuanLy<T> {
    void them(T t);
    void sua(String name,T t);
    void xoa(String name, T t);


    int timKiem(String name);

    void sapXep();
    void display();
}
