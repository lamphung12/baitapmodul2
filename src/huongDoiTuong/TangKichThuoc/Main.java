package huongDoiTuong.TangKichThuoc;

public class Main {
    public static void main(String[] args) {
        KhoiVe[] khoiVes=new KhoiVe[4];
        khoiVes[0]=new Circle("blue",true,6);
        khoiVes[1]=new Rectangle(8,6);
        khoiVes[2]=new Rectangle("red",true,5,3);


        for (KhoiVe elements: khoiVes) {
            System.out.println(elements);

        }
        int percent= (int) Math.floor(Math.random()*100);

        System.out.println("sau khi thay đổi element;");
        for (KhoiVe elements: khoiVes) {
            elements.resize(percent);
            System.out.println(elements);
        }

//
//        Circle cc= new Circle();
//        for(KhoiVe sc : khoiVes){
//            System.out.println(sc.toString());
//            if(sc instanceof Circle){
//                cc.howToColor();
//            }
//        }


    }

}
