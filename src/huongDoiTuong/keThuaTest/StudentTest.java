package huongDoiTuong.keThuaTest;

public  class StudentTest extends PersonTest {
    private double gpa;

    public StudentTest() {
    }

    public StudentTest(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "gpa=" + gpa +
                super.toString()+
                '}';
    }
}



