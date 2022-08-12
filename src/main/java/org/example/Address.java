package org.example;

// XML Configuration with resources/Spring.xml
public class Address {
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    @Override
    public String toString() {
        return "Country: "+country+", City: "+city+", State: "+state+", ZipCode: "+zipcode;
    }

    private String city;
    private String state;
    private String country;
    private String zipcode;
}
