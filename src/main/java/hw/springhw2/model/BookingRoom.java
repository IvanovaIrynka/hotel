package hw.springhw2.model;/*
  @author   User
  @project   spring-hw2
  @class  BookingRoom
  @version  1.0.0 
  @since 05.05.2022 - 20.54
*/

import java.time.LocalDate;

public class BookingRoom {
    private String id;
    private String name;
    private String description;
    private HotelRoom roomNumber;
    private LocalDate bookedAt;
    private LocalDate settlementAt;
    private LocalDate settingOut;


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

    public HotelRoom getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(HotelRoom roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDate bookedAt) {
        this.bookedAt = bookedAt;
    }

    public LocalDate getSettlementAt() {
        return settlementAt;
    }

    public void setSettlementAt(LocalDate settlementAt) {
        this.settlementAt = settlementAt;
    }

    public LocalDate getSettingOut() {
        return settingOut;
    }

    public void setSettingOut(LocalDate settingOut) {
        this.settingOut = settingOut;
    }
}
