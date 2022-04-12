package huongDoiTuong.keThua;

public class Shape {
    //khai báo thuộc tính
    String color = "green";
    boolean filled = false;

    //khởi tạo không tham số
    public Shape() {

    }

    public Shape(String color, boolean filled) {
    }

    // phương thức khởi tạo
    public void LopShape(String color, boolean filled) {
        this.color = color;
        this.filled= filled;
    }

    //getter và setter cho thuộc tính
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
        return "A shape with color of" + getColor() + "and" +
                (isFilled() ? "filled":"not filled");
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("red",true);
        System.out.println(shape);


    }
}




