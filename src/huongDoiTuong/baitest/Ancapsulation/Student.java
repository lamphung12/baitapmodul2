package huongDoiTuong.baitest.Ancapsulation;

public class Student {
    private int id;
    private int age;
    private int score;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int id, int age, int score, String name, String address) {
        this.id = id;
        this.age = age;
        this.setScore (score);
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getScore() {
        return score;
    }

    public void getScore(int score) {
        this.score = score;
    }

    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else if (score > 10) {
            this.score = 10;
        }else {
            this.score = score;
        }

    }

    public static void main(String[] args) {
        Student st = new Student(1001, 20, 9, "Long", "Tan Tien");
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getScore());
        st.setScore(-7);
        System.out.println(st.getScore());
        st.setScore(15);
        System.out.println(st.getScore());

    }
}
