package fr.cxir.arcturus.Models;

import java.util.List;

public class User {

    private Integer     id;
    private String      name;
    private String      firstName;
    private List<Role>  roles;
    private List<Cart>  carts;
    private List<Store> stores;
    private List<Store> loyaltyStores;
    private List<Cart>  sharedCarts;

    public User( Integer     id,
                 String      name,
                 String      firstName,
                 List<Role>  roles,
                 List<Cart>  carts,
                 List<Store> stores,
                 List<Store> loyaltyStores,
                 List<Cart>  sharedCarts) {

        this.id            = id;
        this.name          = name;
        this.firstName     = firstName;
        this.roles         = roles;
        this.carts         = carts;
        this.stores        = stores;
        this.loyaltyStores = loyaltyStores;
        this.sharedCarts   = sharedCarts;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Store> getLoyaltyStores() {
        return loyaltyStores;
    }

    public List<Cart> getSharedCarts() {
        return sharedCarts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", roles=" + roles +
                ", carts=" + carts +
                ", stores=" + stores +
                ", loyaltyStores=" + loyaltyStores +
                ", sharedCarts=" + sharedCarts +
                '}';
    }
}
