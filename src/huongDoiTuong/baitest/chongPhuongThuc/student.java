package huongDoiTuong.baitest.chongPhuongThuc;

public  class student {
    private  String name;
    private  char gender;
    public student(){
        name="UnKnown";
        gender='u';
    }
    public student(String name){
        this.name=name;
        gender='u';
    }
    public student(char geneder){
        this.gender=gender;
        name="Unknown";
    }
    public student(String name, char gender){
        this.name=name;
        this.gender=gender;
    }
    public void display(){
        System.out.println("Name: "+ name);
        if(gender == 'm'){
            System.out.println("Gender : Male");
        }
        if(gender == 'f'){
            System.out.println("Gender : Female");
        }
        if(gender == 'u'){
            System.out.println("Gender: Unknown");
        }
    }
    public static void main(String[]args){
        student s1= new student("Thu", 'f' );
        s1.display();
        student s2 = new student("Thu");
        s2.display();
        student s3 = new student('u');
        s3.display();
        student s4 = new student('m');
        s4.display();
    }

}
