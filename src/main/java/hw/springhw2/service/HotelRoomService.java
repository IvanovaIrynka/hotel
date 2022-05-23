package hw.springhw2.service;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomService
  @version  1.0.0 
  @since 02.05.2022 - 21.21
*/



import hw.springhw2.model.HotelRoom;
import hw.springhw2.repository.HotelRoomMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class HotelRoomService {
    private LocalDateTime now = LocalDateTime.now();
    private List<HotelRoom> rooms = new ArrayList<>(
            Arrays.asList(
                    new HotelRoom("0", "no", "view on the park", "vip", "2 people", 100),
                    new HotelRoom("11", "no", "no", "vip", "4 people", 350),
                    new HotelRoom("21", "no", "no", "standard", "2 people", 100),
                    new HotelRoom("31", "no", "no", "standard", "3 people", 250)));

    @Autowired
    HotelRoomMongoRepository repository;
    @PostConstruct
    void init(){
        repository.saveAll(rooms);
    }
    public List<HotelRoom> getAllRooms(){
        return repository.findAll();
    }
}
