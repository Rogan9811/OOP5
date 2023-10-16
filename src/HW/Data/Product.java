package HW.Data;

public abstract class Product {
    public int cost;
    public String name;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " cost = " + cost +
                '}';
    }
}
