package huongDoiTuong.accesmodifier.student;

public class Account {
    private int id;
    private String name;
    private int balance;

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
    public int deposit(int amount){
      return balance + amount;
    }
    public void withdraw( int amount ){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("That amount exceeds your current balance.");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
       Account acc = new Account(1000,"Long",2000);
        System.out.println(acc.toString());
       acc.withdraw(2100);
       acc.deposit(600);
       System.out.println(acc.getBalance());
    }
}
