package hw.springhw2.service;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomService
  @version  1.0.0 
  @since 02.05.2022 - 21.21
*/



import hw.springhw2.model.Customer;
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
                    new HotelRoom("0", "1", "view on the park", "vip", "2 people", 100,now,now),
                    new HotelRoom("11", "2", "no", "vip", "4 people", 350, now,now),
                    new HotelRoom("21", "3", "no", "standard", "2 people", 100,now,now),
                    new HotelRoom("100","vip","only vip person","luxury","10",1000,now,now),
                    new HotelRoom("31", "4", "no", "standard", "3 people", 250,now,now)));


    @Autowired
    HotelRoomMongoRepository repository;
    @PostConstruct
    void init(){
        repository.saveAll(rooms);
    }

    public List<HotelRoom> getAllRooms(){
        return repository.findAll();
    }
    public HotelRoom getRoomById(String id){
        return repository.findById(id).orElse(null);}

    public HotelRoom create(HotelRoom room){
        room.setCreatedAt(LocalDateTime.now());
        HotelRoom hotelRoomFromDB = repository.save(room);
        System.out.println(room.getId());
        return  hotelRoomFromDB;}

    public HotelRoom update(HotelRoom room){
        room.setUpdatedAt(LocalDateTime.now());
        String id = room.getId();
        room.setCreatedAt(repository.findById(id).orElse(null).getCreatedAt());
        return repository.save(room);}

    public void delete(String id){
        repository.deleteById(id);}

    public List<String> getRooms(){
        List<String> rooms = new ArrayList<>();
        repository.findAll().forEach(room ->rooms.add(room.getName()
                +" Description:"+room.getDescription()
                +" Comfort:"+room.getComfort()
                +" Capacity:"+room.getCapacity()
                +" Price:"+room.getName()));
        return rooms;
    }
   /* public HotelRoom roomById(String rooms){
        List<String> listRooms=Arrays.asList(rooms.split(" +"));
        return repository.queryFindById(listRooms.get(listRooms.size()-1));
    }*/

}
