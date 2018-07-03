package fr.cxir.arcturus.Models;

import java.util.List;

public class Category {

    private Integer       id;
    private String        name;
    private List<Product> products;

    public Category( Integer id,
                     String name,
                     List<Product> products ) {

        this.id       = id;
        this.name     = name;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
