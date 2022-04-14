package huongDoiTuong.keThuaTest;

public class PersonTest {
    private String name;
    private int age;
    private String address;

    public PersonTest() {
    }

    public PersonTest(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
////get va set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PersonTest p = new PersonTest();
        p.getName();
        p.setName("Lam");
        p.getAge();
        p.setAge(22);
        p.getAddress();
        p.setAddress("Tan Tien");
        System.out.println(p.toString());
        PersonTest pt=new StudentTest("Lam",22,"ha noi",4.6);
        System.out.println(pt);
        PersonTest per =new TeacherTest("Lam",11,"Ha Noi",20);
        System.out.println(per);

    }


}
