package huongDoiTuong.accesmodifier.student;

public class myclas {

        static public int X = 2;

        public static void main(String[] args) {
            myclas o1 = new myclas();
            o1.X = 8;
            myclas o2 = new myclas();
            o2.X=10;
            myclas o3= new myclas();
            o3.X=21;

            System.out.printf("x=%d, y=%d,d=%d, z=%d", o1.X, o2.X,o3.X ,myclas.X);
        }
    }

