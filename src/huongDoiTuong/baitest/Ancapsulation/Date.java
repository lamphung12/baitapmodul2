package huongDoiTuong.baitest.Ancapsulation;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
//    public void setDate(int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void display(){
        String day = this.day + " ";
        String month = this.month + " ";
        String year = this.year + " ";
        if(this.day>0 && this.month>0 && this.year>0  ){
            System.out.println(day +"/"+ month + "/"+ year);
        }
    }
    public static void main(String[]args){
        Date da =new Date(21,5,2000);da.display();
       da.setDay(12);
       da.getDay();
       da.setMonth(3);
       da.getMonth();
       da.setYear(1923);
       da.getYear();
       da.display();

    }
}
