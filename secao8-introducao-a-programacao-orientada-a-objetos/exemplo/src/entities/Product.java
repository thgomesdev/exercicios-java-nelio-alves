package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
        System.out.println(this);
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
        System.out.println(this);
    }

    public String toString(){
        return "Nome do Produto: " +
                name +
                " | Preço: " +
                String.format("%.2f", price) +
                " | " +
                quantity +
                " Unidades | Total: " +
                String.format("%.2f", totalValueInStock());
    }
}
