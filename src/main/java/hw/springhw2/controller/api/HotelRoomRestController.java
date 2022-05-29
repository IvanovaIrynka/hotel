package hw.springhw2.controller.api;
/*
  @author   User
  @project   spring-hw2
  @class  HotelRoomRestController
  @version  1.0.0 
  @since 02.05.2022 - 21.37
*/



import hw.springhw2.model.HotelRoom;
import hw.springhw2.service.HotelRoomService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
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
                    @Authorization(value="all rooms",
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
            @ApiResponse(code = 404, message = "Rooms is not found!!!") })
    @GetMapping("/")
    public List<HotelRoom> getAllRooms(){
        return service.getAllRooms();
    }
    @ApiOperation(value = "Get one client by id  ",
            response = GetMapping.class,
            notes = "Id of client is required")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Client is not found!!!") })
    @GetMapping("/{id}")
    public HotelRoom getItemById(@PathVariable(value = "id") String id){
        return service.getRoomById(id);}

    @ApiOperation(value = "Create one client ",
            notes = "Id of client isn't required")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 201, message = "Customer CREATED successful"),
            @ApiResponse(code = 400, message = "Bad request, try ones more"),
            @ApiResponse(code = 401, message = "You not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Client is not found!!!") })
    @PostMapping("/")
    public HotelRoom create(@RequestBody HotelRoom room){
        return service.create(room);}

    @ApiOperation(value = "Update one client ",
            notes = "id of client isn't required")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 201, message = "Customer UPDATED successful"),
            @ApiResponse(code = 400, message = "Bad request, try ones more"),
            @ApiResponse(code = 401, message = "You not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Client is not found!!!") })
    @PutMapping("/edit/{id}")
    public HotelRoom update(@RequestBody HotelRoom room){
        return service.update(room);
    }

    @ApiOperation(value = "Delete one client ",
            notes = "Id of client is required")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 204, message = "Not found"),
            @ApiResponse(code = 401, message = "You not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Client is not found!!!") })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") String id){
        service.delete(id);
    }
}
