package ar.com.bateriasroca.brspringwebapp.model;

import javax.persistence.*;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;

    @OneToOne
    private Battery battery;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("price " + getPrice() + "\n");
        sb.append("battery:" + "\n");
        sb.append("\t brand: " + getBattery().getBrand() + "\n");
        sb.append("\t model: " + getBattery().getModel() + "\n");
        sb.append("\t description: " + getBattery().getDescription() + "\n");
        sb.append("\t capacity: " + getBattery().getCapacity() + "\n");

        return sb.toString();
    }
}
