package hw.springhw2.controller.api;/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomRestController
  @version  1.0.0 
  @since 02.05.2022 - 21.37
*/

import hw.springhw2.model.Customer;
import hw.springhw2.model.HotelRoom;
import hw.springhw2.service.HotelRoomService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
@Api(value="Empty",
        description="All the necessary controllers")
public class HotelRoomRestController {

    @Autowired
     HotelRoomService service;

    @ApiOperation(value = "Get list of Customers in the System ",
            tags = "Get all clients (Customer Rest controller) ",
            notes = "No special parameters",
            authorizations = {
                    @Authorization(value="all clients",
                            scopes = {@AuthorizationScope(
                                    scope = "show clients",
                                    description = "allows show one  clients")
                            }
                    )
            })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Client is not found!!!") })
    @GetMapping("/")
    public List<HotelRoom> getAllRooms(){
        return service.getAllRooms();
    }
}
