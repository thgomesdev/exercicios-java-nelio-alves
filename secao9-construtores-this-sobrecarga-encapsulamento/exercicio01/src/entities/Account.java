package entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name, double amount) {
        this.number = number;
        this.name = name;
        depositAmount(amount);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount){
        balance += amount;
    }
    public void withdrawAmount(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Account " +
                getNumber() +
                ", Holder: " +
                getName() +
                ", Balance: $" +
                getBalance();
    }
}
