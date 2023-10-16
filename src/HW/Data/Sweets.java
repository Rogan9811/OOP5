package HW.Data;

public class Sweets extends Product{
    int quantly;

    public int getQuantly() {
        return quantly;
    }

    public Sweets(String name,int quantly, int cost) {
        super(name, cost);
        this.quantly = quantly;
    }



    public int setQuantly(String name) {
        this.quantly = quantly;
        return quantly;
    }

    public String setProduct(){
        return name;
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " quantly = " + quantly +
                " cost = " + cost +
                '}';
    }
}
