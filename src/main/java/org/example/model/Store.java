package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            p.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark Chocolate", 5.5, "Rich taste", 70.0);
        products[1] = new Coke("Classic Coke", 2.0, "Refreshing drink", 330);
        products[2] = new Bread("Whole Wheat", 3.0, "Healthy bread", true);

        Store store = new Store();
        store.listProducts(products);
    }
}
