package HW.Controller;

import HW.Data.Product;

import java.util.List;

public interface Auto {
    void initProducts(List<Product> newList);

    void printProduct(String name);
}
