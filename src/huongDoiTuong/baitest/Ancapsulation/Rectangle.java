package huongDoiTuong.baitest.Ancapsulation;

public class Rectangle {

    private double wight;
    private double length;


    public Rectangle() {
    }

    public Rectangle(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return wight * length;
    }

    public  double getPerimeter() {
        return (wight + length) * 2;
    }

    public static void main(String[] args) {
        Rectangle re = new Rectangle(3, 11.8);
//        System.out.println("Perimeter :" + getPerimeter());
//        System.out.println("Area :" + getArea());
//        re.setLength(2.4);
//        re.setWight(5.5);
//        System.out.println("Perimeter :" + getPerimeter());
//        System.out.println("Area :" + getArea());


    }

}
