package fr.cxir.arcturus.Models;

import java.util.List;

public class Store {

    private Integer       id;
    private String        name;
    private String        address;
    private String        zipcode;
    private String        city;
    private String        country;
    private Double        latitude;
    private Double        longitude;
    private User          user;
    private List<Product> products;
    private List<User>    users;

    public Store( Integer id,
                  String  name,
                  String  address,
                  String  zipcode,
                  String  city,
                  String  country,
                  Double  latitude,
                  Double  longitude,
                  User    user,
                  List<Product> products,
                  List<User>    users ) {

        this.id        = id;
        this.name      = name;
        this.address   = address;
        this.zipcode   = zipcode;
        this.city      = city;
        this.country   = country;
        this.latitude  = latitude;
        this.longitude = longitude;
        this.user      = user;
        this.products  = products;
        this.users     = users;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", user=" + user +
                ", products=" + products +
                ", users=" + users +
                '}';
    }
}
