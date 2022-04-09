package huongDoiTuong.geometric;

public class classss {
        void method(int x, int y) {
            x = 5;
            y = 5;
        }

        public static void main(String[] args) {
            classss o = new classss();
            int x = 1, y = 1;
            o.method(x, y);
            System.out.printf("x=%d, y=%d", x, y);
        }
    }
