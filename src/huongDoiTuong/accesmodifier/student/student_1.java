package huongDoiTuong.accesmodifier.student;

public class student_1 {
    private int roll;
    private String name;
    private static String slear = "BBDIT";

    //khoi tao ham co tham so\\\\\
   public student_1(int r, String n) {
        roll = r;
        name = n;
    }

    static void change() {
        slear = "CODEGYM";
    }

    void display() {
        System.out.println(roll + " " + name + " " + slear);
    }

    public static void main(String args[]) {
            student_1.change();

            student_1 s1 = new student_1(111, "Hoang");
            student_1 s2 = new student_1(222, "Khanh");
            student_1 s3 = new student_1(333, "Nam");

            s1.display();
            s2.display();
            s3.display();
        }
    }
