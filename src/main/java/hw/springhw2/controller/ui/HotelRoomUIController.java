package hw.springhw2.controller.ui;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomUIController
  @version  1.0.0 
  @since 02.05.2022 - 21.45
*/


import hw.springhw2.model.HotelRoom;

import hw.springhw2.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.*;


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
        return "rooms";
    }
}
