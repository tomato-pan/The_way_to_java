package java_010;

public abstract class Employee {
    private String name;
    private String address;
    private int number;
    private int salary;
    public Employee(String name, String address, int number, int salary){
        System.out.println("Constructing a Employee");
        this.name=name;
        this.address=address;
        this.number=number;
        this.salary = salary;
    }
    public double computePay(){
        System.out.println("inside Employee computePay");
        return 0.0;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to "+ this.name+" " +this.address );

    }
    public String toString(){
        return name+" "+address+" "+number+" "+salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
