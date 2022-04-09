package huongDoiTuong;

public class student1 {

        String name;
        int age;
        public student1(String name, int age){
            this.name=name;
            this.age=age;
        }
        public void display(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        public static void main(String[] args) {
            student1[] students = new student1[3];
            students[0]=new student1("Tuan",24);
            students[1]=new student1("Cuong",25);
            students[2]=new student1("Duc",24);
            for (int i = 0; i < 3; i++) {
                students[i].display();
            }
        }

}
