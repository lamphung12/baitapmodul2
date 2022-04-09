package huongDoiTuong.accesmodifier.student;

public class Circle {
    private double radius=1.0;
    private String Color=" Red";

    public Circle() {
    }

    public Circle(double radius ) {
        this.radius = radius;

    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14 * 3.14 * radius ;
    }


    public static void main(String[] args) {
            Circle c=new Circle(7);
        System.out.println(c.getRadius());
        System.out.println(c.getArea() );
    }
}
