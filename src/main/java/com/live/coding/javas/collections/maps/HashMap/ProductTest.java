package com.live.coding.javas.collections.maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {

    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        System.out.println(productsByName.size());

        Product newEBike = new Product("E-Bike", "A bike with a better battery");
        productsByName.put(newEBike.getName(), newEBike);

        System.out.println(productsByName.size());

        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
        productsByName.put(null, defaultProduct);

        Product nextPurchase = productsByName.get(null);
        System.out.println(nextPurchase);

    }

}
