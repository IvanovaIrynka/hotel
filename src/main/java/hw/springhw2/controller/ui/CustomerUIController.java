package hw.springhw2.controller.ui;/*
  @author   User
  @project   spring-hw2
  @class  CustomerUIController
  @version  1.0.0 
  @since 01.04.2022 - 20.09
*/

import hw.springhw2.form.CustomerForm;
import hw.springhw2.model.Customer;
import hw.springhw2.model.Discount;
import hw.springhw2.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/ui/v1/customers")
public class CustomerUIController {

    @Autowired
    CustomerService service;

    @GetMapping("/")
    public String getAll(Model model){
        List<Customer> list = service.getAllClients();
        model.addAttribute("customer", list);
        return "customer";
    }
    @GetMapping("/delete/{id}")
    public String getDelete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/v1/customers/";
    }


   /* @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String addCustomer(Model model, @PathVariable String id){
        Customer customer= service.getOneById(id);
        model.addAttribute("edit", customer);
        return "edit-customer";
    }*/
   /* @PostMapping("/")
    public String update(@ModelAttribute("edit") Customer customer){
        service.update(customer);
        return "redirect:/ui/v1/customers/";
    }*/
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String addCustomer(Model model, @PathVariable("id") String id){
        Customer customer= service.getOneById(id);
        CustomerForm customerForm = new CustomerForm();
        customerForm.setId(customer.getId());
        customerForm.setName(customer.getName());
        customerForm.setSurname(customer.getSurname());
        customerForm.setPatronymic(customer.getPatronymic());
        customerForm.setBirthday(customer.getBirthday().toString());
        customerForm.setPhoneNumber(customer.getPhoneNumber());
        customerForm.setRoomInAHotel(customer.getRoomInAHotel());
        customerForm.setDescription(customer.getDescription());
        customerForm.setCreatedAt(customer.getCreatedAt().toString());
        model.addAttribute("edit",customerForm);
        return "edit-customer";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String addCustomer(@PathVariable("id") String id,
                           @ModelAttribute("edit") CustomerForm form ){
        Customer customer= service.getOneById(id);
        customer.setName(form.getName());
        customer.setSurname(form.getSurname());
        customer.setPatronymic(form.getPatronymic());
        LocalDate d = LocalDate.parse(form.getBirthday());
        LocalDateTime l = d.atStartOfDay();
        customer.setBirthday(LocalDate.parse(form.getBirthday()));
        customer.setPhoneNumber(form.getPhoneNumber());
        customer.setRoomInAHotel(form.getRoomInAHotel());
        customer.setDescription(form.getDescription());
        LocalDate date = LocalDate.parse(form.getCreatedAt());
        LocalDateTime ldt = date.atStartOfDay();
        customer.setCreatedAt(LocalDate.parse(form.getCreatedAt()).atTime(0,0,0));
        service.update(customer);
        return "redirect:/ui/v1/customers/";
    }



    @RequestMapping(value = "", method = RequestMethod.GET)
    public String addCustomer(Model model){
        CustomerForm customerForm = new CustomerForm();
        List<Discount> discounts = Arrays.asList(Discount.values());
        model.addAttribute("form", customerForm);
        model.addAttribute("discounts", discounts);
        return "add-customer";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addCustomer( @ModelAttribute("form") CustomerForm form){
        Customer customer= new Customer();
        customer.setName(form.getName());
        customer.setSurname(form.getSurname());
        customer.setPatronymic(form.getPatronymic());
                LocalDate.parse(form.getBirthday());
        customer.setPhoneNumber(form.getPhoneNumber());
        customer.setRoomInAHotel(form.getRoomInAHotel());
        customer.setDiscount(form.getDiscount());
        customer.setDescription(form.getDescription());
        service.create(customer);
        return "redirect:/ui/v1/customers/";
    }


}
