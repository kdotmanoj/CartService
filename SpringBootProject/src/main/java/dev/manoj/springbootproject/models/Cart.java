package dev.manoj.springbootproject.models;

import java.util.List;

public class Cart {
    private Long id;
    private List<Product> products;

    public Cart() {

    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
