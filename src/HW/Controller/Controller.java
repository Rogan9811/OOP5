package HW.Controller;

import HW.Data.BottleOfWater;
import HW.Data.HotDrinks;
import HW.Data.Product;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private VendingAutoHD vendingAutoHD = new VendingAutoHD();
    private VendingAutoOfBOW vendingAutoOfBOW = new VendingAutoOfBOW();
    private List<Product> hotDrinksList = new ArrayList<Product>();
    private List<Product> bottleOfWaterList = new ArrayList<Product>();

    public Controller(VendingAutoHD vendingAutoHD) {
        this.vendingAutoHD = vendingAutoHD;
    }

    public Controller(VendingAutoOfBOW vendingAutoOfBOW) {
        this.vendingAutoOfBOW = vendingAutoOfBOW;
    }

    public void addHotDrink(String name, int temperature, int cost){
        hotDrinksList.add(new HotDrinks(name, temperature, cost));
        vendingAutoHD.initProducts(hotDrinksList);
    }

    public void addBOW(String name, int volumeSize, int cost){
        bottleOfWaterList.add(new BottleOfWater(name, volumeSize, cost));
        vendingAutoOfBOW.initProducts(bottleOfWaterList);
    }

    public void printInfo(VendingAutoHD vendingAutoHD){
        System.out.println(vendingAutoHD.toString());
    }
    public void printInfo(VendingAutoOfBOW vendingAutoOfBOW){
        System.out.println(vendingAutoOfBOW.toString());
    }
}
