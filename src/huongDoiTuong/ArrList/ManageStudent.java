package huongDoiTuong.ArrList;

import java.util.ArrayList;

public class ManageStudent {
    ArrayList<Student> students;

    public ManageStudent() {
        this.students = new ArrayList<>();
    }

    /////them////
    public void add(Student student) {
        students.add(student);
    }
    ///////Ham hien thi-----////
    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("--------------");
    }

    /////ham tim kiem-----///
    public int findByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    ////ham sua ---///
    public void edit(String name,Student student){
       int indexOfStudent = findByName(name);
       if(indexOfStudent == -1){
           System.out.println("Khong co");
       }else{
           students.set(indexOfStudent,student);
       }

    }
    ////////xoa///
    public void delete(String name){
        int indexOfStudent = findByName(name);
        if(indexOfStudent == -1){
            System.out.println("Khong co");
        }else{
            students.remove(indexOfStudent);
        }
    }



}
