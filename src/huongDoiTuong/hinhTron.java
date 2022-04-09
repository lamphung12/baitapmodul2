package huongDoiTuong;

public class hinhTron {

        private double radius;
        public  hinhTron(double radius){
            this.radius=radius;
        }
        public double getArea(){
            return 3.14*radius*radius;
        }
        public double getCircumference(){
            return 3.14*2*radius;
        }


        public static void main(String[] args){
            hinhTron c = new hinhTron(7.0);
            System.out.println(c.getArea());
            System.out.println(c.getCircumference());
        }

}
