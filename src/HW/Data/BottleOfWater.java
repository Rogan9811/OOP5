package HW.Data;

public class BottleOfWater extends Product{
    int volumeSize;

    public int getVolumeSize() {
        return volumeSize;
    }

    public BottleOfWater(String name, int volumeSize, int cost) {
        super(name, cost);
        this.volumeSize = volumeSize;
    }

    public void setVolumeSize(String name) {
        this.volumeSize = volumeSize;
    }

    public String setProduct() {
        return name;
    }

    @Override
    public String toString() {
        return "Product {" + name + " vol " + volumeSize + " cost = " + cost + '}';
    }
}
