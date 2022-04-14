package huongDoiTuong.ArrList;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent= new ManageStudent();
        //////////// them  ///
        manageStudent.add(new Student(111,"lam",23));
        manageStudent.add(new Student(3331,"Trung",22));
        manageStudent.display();

        manageStudent.edit("lam",new Student(12,"son",12));
        manageStudent.display();

        manageStudent.delete("Trung");
        manageStudent.display();


        ManageTeacher mnTeacher = new ManageTeacher();
        mnTeacher.add(new Teacher(101,"Long",22,20000,20));
        mnTeacher.add(new Teacher(102,"Quang",20,43000,10));
        mnTeacher.add(new Teacher(103,"Lam",32,52000,30));
        mnTeacher.display();

        System.out.println(mnTeacher.findByName(101));




    }
}
