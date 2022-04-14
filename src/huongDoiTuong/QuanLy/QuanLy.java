package huongDoiTuong.QuanLy;

public interface QuanLy<T> {
   void them(T t);
   void sua(String name,T t);
   void xoa(String name);
   int timKiem();

   int timKiem(String name);

   void sapXep();
   void print();


}
