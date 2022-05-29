package hw.springhw2.controller.ui;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomUIController
  @version  1.0.0 
  @since 02.05.2022 - 21.45
*/

import hw.springhw2.form.RoomForm;
import hw.springhw2.model.HotelRoom;

import hw.springhw2.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/ui/v1/rooms")
public class HotelRoomUIController {
    @Autowired
    HotelRoomService service;

    @GetMapping("/")
    public String getAll(Model model){
        List<HotelRoom> list = service.getAllRooms();
        model.addAttribute("rooms", list);
        return "hotelRoom";
    }
    @GetMapping("/delete/{id}")
    public String getDelete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/v1/rooms/";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editRoom(Model model, @PathVariable("id") String id){
        HotelRoom room= service.getRoomById(id);
        RoomForm roomForm = new RoomForm();
        roomForm.setId(room.getId());
        roomForm.setName(room.getName());
        roomForm.setComfort(room.getComfort());
        roomForm.setCapacity(room.getCapacity());
        roomForm.setPrice(room.getPrice());
        roomForm.setDescription(room.getDescription());
        roomForm.setCreatedAt(room.getCreatedAt().toString());
        model.addAttribute("edit",roomForm);
        return "edit-room";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editCustomer(@PathVariable("id") String id,
                              @ModelAttribute("edit") RoomForm form ){
        HotelRoom room= service.getRoomById(id);
        room.setName(form.getName());
        room.setComfort(form.getComfort());
        room.setCapacity(form.getCapacity());
        room.setPrice(form.getPrice());
        room.setDescription(form.getDescription());
        LocalDate date = LocalDate.parse(form.getCreatedAt());
        LocalDateTime ldt = date.atStartOfDay();
        room.setCreatedAt(LocalDate.parse(form.getCreatedAt()).atTime(0,0,0));
        service.update(room);
        return "redirect:/ui/v1/rooms/";
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String addRoom(Model model){
       RoomForm roomForm = new RoomForm();
        model.addAttribute("form", roomForm);
        return "add-room";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addCustomer( @ModelAttribute("form") RoomForm form) {
        HotelRoom room = new HotelRoom();
        room.setName(form.getName());
        room.setComfort(form.getComfort());
        room.setCapacity(form.getCapacity());
        room.setPrice(form.getPrice());
        room.setDescription(form.getDescription());
        service.create(room);
        return "redirect:/ui/v1/rooms/";
    }
}
