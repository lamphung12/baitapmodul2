package huongDoiTuong.TangKichThuoc;

public class KhoiVe implements Resizeable {
    private String color = "green";
    private boolean filled = true;
    public KhoiVe() {
    }

    public KhoiVe(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
//get va set//
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return
                " ,color='" + color + '\'' +
                        ", filled=" + filled +
                        '}';
    }



    @Override
    public void resize(double percent) {

    }
}
