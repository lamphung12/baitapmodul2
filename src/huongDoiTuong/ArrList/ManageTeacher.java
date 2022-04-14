package huongDoiTuong.ArrList;

import java.util.ArrayList;

public class ManageTeacher implements Manege<Teacher>{
    ArrayList<Teacher> danhSach;

    public ManageTeacher() {
        this.danhSach = new ArrayList<>();
    }

    public ManageTeacher(ArrayList<Teacher> danhSach) {
        this.danhSach = danhSach;
    }
    /////them////
    @Override
    public void add(Teacher te) {
     danhSach.add(te);
    }
///////    hien thi    ------////
    @Override
    public void display() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
        System.out.println("--------------");
    }
 //////// sua-----////
    @Override
    public void edit(int id) {
        int indexOfTeacher = findByName(id);
        if(indexOfTeacher == -1){
            System.out.println("Khong co");
        }else{
//            danhSach.set(id);
        }
    }

    @Override
    public int findByName(int id ){
       for(int i=0;i<danhSach.size();i++){
           if(danhSach.get(i).getId()== (id)){
               return i;
           }
       }
       return -1;
    }

    @Override
    public void delete() {

    }
}
