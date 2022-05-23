package hw.springhw2.model;/*
  @author   User
  @project   database
  @class  HotelRoom
  @version  1.0.0 
  @since 28.11.2021 - 18.44
*/

import java.util.Objects;

public class HotelRoom {
    private String id;
    private String name;
    private String description;
    private String comfort;
    private String capacity;
    private int price;


    public HotelRoom() {}

    public HotelRoom(String name,
                     String description,
                     String comfort,
                     String capacity,
                     int price
                     ) {
        this.name = name;
        this.description = description;
        this.comfort = comfort;
        this.capacity = capacity;
        this.price = price;

    }


    public HotelRoom(String id,
                     String name,
                     String description,
                     String comfort,
                     String capacity,
                     int price
                    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.comfort = comfort;
        this.capacity = capacity;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRoom hotelRoom = (HotelRoom) o;
        return getId().equals(hotelRoom.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", comfort='" + comfort + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
