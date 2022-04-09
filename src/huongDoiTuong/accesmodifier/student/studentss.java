package huongDoiTuong.accesmodifier.student;

public class studentss {
    private String name ="Join ";
    private String lop ="C02";

    public studentss() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void main(String[] args) {
     studentss st=new studentss();
      st.setName("Lam") ;
      st.setLop("C022H1");
        System.out.println("Hoc sinh ten moi:"+st.getName());
        System.out.println("Hoc sinh lop moi:"+st.getLop());
    }
}
