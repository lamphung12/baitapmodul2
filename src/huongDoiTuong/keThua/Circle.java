package huongDoiTuong.keThua;

import huongDoiTuong.baitest.hinhTron;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }

    @Override
    public String toString() {
        return "hinhTron{" +
                "getArea=" + getArea() + "getCircumferrence =" + getCircumference() + "color" + getColor() +
                '}';
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.5, "Red");
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }

    public static class Cylinder extends Circle {
        private int chieuCao;

        public Cylinder(double radius, String color, int chieuCao) {
            super(radius, color);
            this.chieuCao = chieuCao;
        }

        public Cylinder() {
        }

        public int getChieuCao() {
            return chieuCao;
        }

        public void setChieuCao(int chieuCao) {
            this.chieuCao = chieuCao;
        }
        public double theTich(double radius){
            return 3.14 * radius * radius * chieuCao;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    ", chieuCao=" + chieuCao + "theTich = "+ theTich(4.2)+
                    '}';
        }

        public static void main(String[] args) {
            Cylinder c = new Cylinder(3.3,"red",5);
            System.out.println( c.toString());
        }
    }
}