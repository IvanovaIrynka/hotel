package hw.springhw2.form;/*
  @author   User
  @project   spring-hw2
  @class  CustomerForm
  @version  1.0.0 
  @since 08.04.2022 - 21.17
*/

import hw.springhw2.model.Discount;

public class CustomerForm {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String birthday ;
    private String description;
    private String phoneNumber;
    private String roomInAHotel;
    private Discount discount;
    private String createdAt;
    private String updatedAt;

    public CustomerForm() {
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomInAHotel() {
        return roomInAHotel;
    }

    public void setRoomInAHotel(String roomInAHotel) {
        this.roomInAHotel = roomInAHotel;
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
        return "CustomerForm{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roomInAHotel='" + roomInAHotel + '\'' +
                '}';
    }
}



