package huongDoiTuong.baitest.Ancapsulation;

public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
//    public void deposit(int amount){
//        return amount(balence += amount);
//    }


    public static void main(String[] args) {

    }
}
