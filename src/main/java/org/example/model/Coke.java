package org.example.model;

public class Coke extends ProductForSale {
    private int volumeML;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, int volumeML) {
        super(type, price, description);
        this.volumeML = volumeML;
    }

    public int getVolumeML() {
        return volumeML;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume (ml): " + volumeML);
        System.out.println("Sales Price for 1 unit: " + getSalesPrice(1));
        System.out.println("-------------------------");
    }
}
