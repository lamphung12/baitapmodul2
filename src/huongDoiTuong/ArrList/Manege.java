package huongDoiTuong.ArrList;

public interface Manege <T>{
    void add( T t);
    void display();
    void edit(int id);
    int findByName(int id);
    void delete();


}
