package huongDoiTuong.keThuaTest;

public class TeacherTest extends PersonTest{
    private int salary;

    public TeacherTest() {
    }

    public TeacherTest(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }
  ////get va set salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeacherTest{" +super.toString()+
                "salary=" + salary +
                '}';
    }
}
