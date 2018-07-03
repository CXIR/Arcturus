package fr.cxir.arcturus.Models;

import java.util.List;

public class Product {

    private Integer        id;
    private String         name;
    private String         info;
    private String         barreCode;
    private List<Cart>     carts;
    private List<Category> categories;
    private List<Store>    stores;

    public Product( Integer id,
                    String  name,
                    String  info,
                    String  barreCode,
                    List<Cart>     carts,
                    List<Category> categories,
                    List<Store>    stores ) {

        this.id         = id;
        this.name       = name;
        this.info       = info;
        this.barreCode  = barreCode;
        this.carts      = carts;
        this.categories = categories;
        this.stores     = stores;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getBarreCode() {
        return barreCode;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Store> getStores() {
        return stores;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", barreCode='" + barreCode + '\'' +
                ", carts=" + carts +
                ", categories=" + categories +
                ", stores=" + stores +
                '}';
    }
}
