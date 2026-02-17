package org.magar.touristmanagementapplication.model;

import jakarta.persistence.*;

@Entity
@Table(name="TouristTable")
public class Tourist
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String city;
    private String packageType;
    private Double price;

    //Non parameterize Constructor
    public Tourist()
    {
        super();
    }
    //Parametrize Constructors
    public Tourist(String name, String city, String packageType, Double price)
    {
        super();
        this.name = name;
        this.city = city;
        this.packageType = packageType;
        this.price = price;
    }
    //Setter and getter methods to set and get the values
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //To String method to display the result
    @Override
    public String toString() {
        return "Tourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", packageType='" + packageType + '\'' +
                ", price=" + price +
                '}';
    }
}
