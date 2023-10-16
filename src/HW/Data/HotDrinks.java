package HW.Data;

public class HotDrinks extends Product{
    int temperature;

    public int getTemperature() {
        return temperature;
    }

    public HotDrinks(String name, int temperature, int cost) {
        super(name, cost);
        this.temperature = temperature;
    }

    public String setProduct() {
        return name;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product {" + name + " temperature = " + temperature + " cost = " + cost + '}';
    }
}
