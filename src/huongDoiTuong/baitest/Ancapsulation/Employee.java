package huongDoiTuong.baitest.Ancapsulation;

public class Employee {
    private int id;
    private String fistName;
    private String lastName;
    private int salary;
    public Employee(int id, String fistName,String lastName,int salary){
        this.id=id;
        this.fistName=fistName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setFistName(String fistName){
        this.fistName=fistName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int  getId(){
        return id;
    }
    public String  getFistName(){
        return fistName;
    }
    public String  getLastName(){
        return lastName;
    }
    public int  getSalary(){
        return salary;
    }
    public String getFullName(){
        return fistName+""+lastName;
    }
    public static void main(String[]args ){
        Employee em = new Employee(1,"Kien", "Hoang",1000);
        System.out.println("Id: "+ em.getId());
        System.out.println("Name: "+ em.getFullName());
        System.out.println("Salary: "+em.getSalary());
    }
}
