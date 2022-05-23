package hw.springhw2.controller.api;/*
  @author   User
  @project   spring-hw2
  @class  CustomerRestController
  @version  1.0.0 
  @since 13.03.2022 - 18.37
*/

import hw.springhw2.model.Customer;
import hw.springhw2.service.CustomerService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@Api(value="Empty",
        description="All the necessary controllers")
public class CustomerRestController {

    @Autowired
    CustomerService service;

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
    public List<Customer> getAll(){
        return service.getAllClients();
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
    public Customer getItemById(@PathVariable(value = "id") String id){
        return service.getOneById(id);}

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
    public Customer create(@RequestBody Customer customer){
        return service.create(customer);}

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
    public Customer update(@RequestBody Customer customer){
        return service.update(customer);
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




