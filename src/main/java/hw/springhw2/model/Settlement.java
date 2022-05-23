package hw.springhw2.model;/*
  @author   User
  @project   database
  @class  Settlement
  @version  1.0.0 
  @since 28.11.2021 - 18.51
*/

import java.time.LocalDate;
import java.util.Objects;

public class Settlement {
    private String id;
    private String name;
    private String description;
    private Customer customerNumber;
    private HotelRoom roomNumber;
    private BookingRoom bookingStatus;
    private LocalDate settlement;
    private LocalDate release;
    private String comments;
    private Bill price;


    public Settlement() {
    }

    public Settlement(String id,
                      String name,
                      String description,
                      Customer customerNumber,
                      HotelRoom roomNumber,
                      LocalDate settlement,
                      LocalDate release,
                      String comments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.customerNumber = customerNumber;
        this.roomNumber = roomNumber;
        this.settlement = settlement;
        this.release = release;
        this.comments = comments;
    }

    public Settlement(String name,
                      String description,
                      Customer customerNumber,
                      HotelRoom roomNumber,
                      LocalDate settlement,
                      LocalDate release,
                      String comments) {
        this.name = name;
        this.description = description;
        this.customerNumber = customerNumber;
        this.roomNumber = roomNumber;
        this.settlement = settlement;
        this.release = release;
        this.comments = comments;
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

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Customer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public HotelRoom getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(HotelRoom roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getSettlement() {
        return settlement;
    }

    public void setSettlement(LocalDate settlement) {
        this.settlement = settlement;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BookingRoom getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingRoom bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Bill getPrice() {
        return price;
    }

    public void setPrice(Bill price) {
        this.price = price;
    }

    public Settlement(String id, String name, String description, Customer customerNumber, HotelRoom roomNumber, BookingRoom bookingStatus, LocalDate settlement, LocalDate release, String comments, Bill price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.customerNumber = customerNumber;
        this.roomNumber = roomNumber;
        this.bookingStatus = bookingStatus;
        this.settlement = settlement;
        this.release = release;
        this.comments = comments;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Settlement that = (Settlement) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", customerNumber=" + customerNumber +
                ", roomNumber=" + roomNumber +
                ", settlement=" + settlement +
                ", release=" + release +
                ", comments='" + comments + '\'' +
                '}';
    }
}

