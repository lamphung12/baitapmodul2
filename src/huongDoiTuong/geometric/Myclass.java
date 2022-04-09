package huongDoiTuong.geometric;

public class Myclass {

        static public int X = 2;

        static {
            X = 1;
        }

        static public void method() {
            X = 5;
        }

        public static void main(String[] args) {
            Myclass o = new Myclass();
            Myclass.method();
            Myclass.X = 10;
            System.out.printf("x=%d, y=%d", o.X, Myclass.X);
        }
    }
