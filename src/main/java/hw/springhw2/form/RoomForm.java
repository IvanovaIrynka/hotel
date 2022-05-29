package hw.springhw2.form;/*
  @author   User
  @project   spring-hw2
  @class  CustomerForm
  @version  1.0.0 
  @since 08.04.2022 - 21.17
*/

public class RoomForm {
    private String id;
    private String name;
    private String capacity;
    private String comfort;
    private int price ;
    private String description;
    private String createdAt;
    private String updatedAt;

    public RoomForm() {
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "RoomForm{" +
                "name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", comfort='" + comfort + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}



