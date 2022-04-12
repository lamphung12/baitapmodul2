package huongDoiTuong.baitest.Ancapsulation;

public class Point {
    private double X;
    private double Y;

    public Point(){};

    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        this.X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        this.Y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.X - x) * (this.X - x) + (this.Y - y) * (this.Y - y));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
    public static void main(String[]args){
        Point p=new Point(3.1,9.4);
        Point p1=new Point( 2.3,5.6);
//        p.setX(3.5);
//        p.setY(2.4);
//        p.getX();
//        p.getY();
        System.out.println(p.distance(p1));
        System.out.println(p.distance(5.9,11.5));




    }
}
