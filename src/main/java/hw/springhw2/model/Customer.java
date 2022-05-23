package hw.springhw2.model;/*
  @author   User
  @project   spring-hw2
  @class  Customer
  @version  1.0.0 
  @since 13.03.2022 - 18.02
*/

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

    @Document
public class Customer {
    @Id
    @ApiModelProperty(value = "UUID is daven by BD",
            name = "id",
            required = false)
    private String id;

    @ApiModelProperty(value = "Customer name",
                        name = "name",
                         required = true)
    @Schema(description = "Name by client", example = "Kate")
    private String name;

    @ApiModelProperty(value = "Customer description",
                name = "description",
                required = false)
    @Schema(description = "Description about client", example = "has allergy to wool")
    private String description;

    @ApiModelProperty(value = "Customer surname",
                name = "surname",
                required = false)
    @Schema(description = "Surname by client", example = "Baker")
    private String surname;

    @ApiModelProperty(value = "Customer patronymic",
                name = "paranomic",
                required = false)
    @Schema(description = "Patronymic by client", example = "Holmes")
    private String patronymic;

    @ApiModelProperty(value = "Date of birth",
                name = "birthday",
                required = true)
    @Schema(description = "Date of birth", example = "1999-01-01")
    private LocalDate birthday ;

    @ApiModelProperty(value = "Phone number",
                name = "phoneNumber",
                required = true)
    @Schema(description = "Phone number", example = "+44000000000")
    private String phoneNumber;

    @ApiModelProperty(value = "Room in which the customer lives",
                name = "roomInAHotel",
                required = true)
    @Schema(description = "Room number", example = "100")
    private String roomInAHotel;

    private Discount discount;

    @ApiModelProperty(value = "Information about client was created at",
                name = "createdAt",
                required = true)
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "Information about client was updated at",
                name = "updatedAt",
                required = true)
    private LocalDateTime updatedAt;

        public Customer() {
        }
    public Customer(String name,
                        String description,
                        String surname,
                        String patronymic,
                        LocalDate birthday,
                        String phoneNumber,
                    String roomInAHotel) {

        this.name = name;
        this.description = description;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.roomInAHotel = roomInAHotel;

    }
    public Customer(String name,
                        String surname,
                        String patronymic,
                        String phoneNumber,
                    String roomInAHotel,
                        String description) {

            this.name = name;

            this.surname = surname;
            this.patronymic = patronymic;
            this.phoneNumber = phoneNumber;
            this.roomInAHotel = roomInAHotel;
            this.description = description;

        }


    public Customer(String id,
                    String name,
                    String description,
                    String surname,
                    String patronymic,
                    LocalDate birthday,
                    String phoneNumber,
                    String roomInAHotel,
                    LocalDateTime createdAt,
                    LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.roomInAHotel = roomInAHotel;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Customer(String name,
                        String surname,
                        String patronymic,
                        LocalDate birthday, String phoneNumber, String roomInAHotel, String description) {


                this.name = name;
                this.description = description;
                this.surname = surname;
                this.patronymic = patronymic;
                this.birthday = birthday;
                this.phoneNumber = phoneNumber;
                this.roomInAHotel = roomInAHotel;}

    public Customer( String name,
                         String description,
                         String surname,
                         String patronymic,
                         LocalDate birthday,
                         String phoneNumber,
                         String roomInAHotel,
                         Discount discount) {

            this.name = name;
            this.description = description;
            this.surname = surname;
            this.patronymic = patronymic;
            this.birthday = birthday;
            this.phoneNumber = phoneNumber;
            this.roomInAHotel = roomInAHotel;
            this.discount = discount;}

        public Customer(String id,
                        String name,
                        String description,
                        String surname,
                        String patronymic,
                        LocalDate birthday,
                        String phoneNumber,
                        String roomInAHotel,
                        Discount discount,
                        LocalDateTime createdAt,
                        LocalDateTime updatedAt) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.surname = surname;
            this.patronymic = patronymic;
            this.birthday = birthday;
            this.phoneNumber = phoneNumber;
            this.roomInAHotel = roomInAHotel;
            this.discount = discount;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

        public Discount getDiscount() {
            return discount;
        }

        public void setDiscount(Discount discount) {
            this.discount = discount;
        }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer item = (Customer) o;
        return getId().equals(item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
        public String toString() {
            return "Customer{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", surname='" + surname + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    ", birthday=" + birthday +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", roomInAHotel='" + roomInAHotel + '\'' +
                    ", discount=" + discount +
                    ", createdAt=" + createdAt +
                    ", updatedAt=" + updatedAt +
                    '}'; }}





