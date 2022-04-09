package huongDoiTuong.geometric;

public class geometic {
    /* các trường dữ liệu */
    private String color = "white";
    private String filled = null;

    /* các khởi tạo tử */
    public geometic() {
    }

    public geometic(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
