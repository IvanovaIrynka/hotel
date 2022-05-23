package hw.springhw2.repository;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomMongoRepository
  @version  1.0.0 
  @since 02.05.2022 - 21.35
*/


import hw.springhw2.model.HotelRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository

    public interface HotelRoomMongoRepository extends  MongoRepository<HotelRoom, String> {

    }

