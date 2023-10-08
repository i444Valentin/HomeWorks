package org.homework.locate;

public class Locate {
    private Long id;
    private String city;
    private String street;
    private String region;
    private Integer numberHome;
    private Integer numberApartment;

    public Locate(Long id, String city, String street, String region, Integer numberHome, Integer numberApartment) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.region = region;
        this.numberHome = numberHome;
        this.numberApartment = numberApartment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(Integer numberHome) {
        this.numberHome = numberHome;
    }

    public Integer getNumberApartment() {
        return numberApartment;
    }

    public void setNumberApartment(Integer numberApartment) {
        this.numberApartment = numberApartment;
    }
}
