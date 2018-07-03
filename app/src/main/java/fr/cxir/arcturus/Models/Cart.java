package fr.cxir.arcturus.Models;

import java.util.List;

public class Cart {

    private Integer       id;
    private User          user;
    private List<Product> products;
    private List<User>    sharedUsers;

    public Cart( Integer id,
                 User    user,
                 List<Product> products,
                 List<User>    sharedUsers ) {

        this.id          = id;
        this.user        = user;
        this.products    = products;
        this.sharedUsers = sharedUsers;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void inCart(Product product){
        this.products.add(product);
    }

    public void outCart(Product product){
        this.products.remove(product);
    }

    public List<User> getSharedUsers() {
        return sharedUsers;
    }

    public void addSharedUser(User user){
        this.sharedUsers.add(user);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                ", sharedUsers=" + sharedUsers +
                '}';
    }
}
