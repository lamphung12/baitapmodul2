package huongDoiTuong.geometric;

public class hcn {

        public int rong, dai;

        public hcn(int rong, int dai) {
            this.rong = rong;
            this.dai = dai;
        }
    }

    class MyClass {
        void method(hcn x) {
            x.rong = 5;
            x.dai = 5;
        }

        public static void main(String[] args) {
            MyClass o = new MyClass();
            hcn cn = new hcn(1, 1);
            o.method(cn);
            System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
        }
}
