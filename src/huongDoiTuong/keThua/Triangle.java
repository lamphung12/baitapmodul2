package huongDoiTuong.keThua;

public class Triangle extends Shape {
    private double side1 =1 ;
    private double side2 =1 ;
    private double side3 =1 ;



    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getArea(){
     double s1 = getPerimeter()/2;
        return Math.sqrt(s1*(s1-side1)*(s1-side2)*(s1-side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
               "Dien tich Tam giac: "+getArea()+
                "Chu vi tam giac"+ getPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Triangle t =new Triangle(5,7.2,8);
        System.out.println(t.toString());
    }
}
