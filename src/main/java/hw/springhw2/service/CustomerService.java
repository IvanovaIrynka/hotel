package hw.springhw2.service;/*
  @author   User
  @project   spring-hw2
  @class  CustomerService
  @version  1.0.0 
  @since 16.03.2022 - 22.21
*/

import hw.springhw2.model.Customer;
import hw.springhw2.model.Discount;
import hw.springhw2.repository.CustomerMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Customer> clients = new ArrayList<>(
            Arrays.asList(
                    new Customer("1",
                            "Stefan",
                            "customer2",
                            "Robinson",
                            "Lewis",
                            LocalDate.of(1955,3,25),
                            "+445596358",
                            "1",
                            Discount.NO,
                            now,
                            now),
                    new Customer("2",
                            "Morgen",
                            "customer3",
                            "Baker",
                            "Holmes",
                            LocalDate.of(1987,8,5),
                            "+4420259939",
                            "2",
                            Discount.NO,
                            now,
                            now),
                    new Customer("3",
                            "Olwen",
                            "customer4",
                            "Chapman",
                            "Webb",
                            LocalDate.of(1982,1,21),
                            "+4421201589",
                            "12",
                            Discount.NO,
                            now,
                            now),
                    new Customer("4",
                            "David",
                            "customer5",
                            "Allen",
                            "Foster",
                            LocalDate.of(1977,5,16),
                            "+4466451439",
                            "15",
                            Discount.DISABLEMENT,
                            now,
                            now),
                    new Customer("5",
                            "Bellatrix",
                            "customer6",
                            "Matthews",
                            "Smith",
                            LocalDate.of(1989,3,22),
                            "+4487556839",
                            "5",
                            Discount.REGULAR_CUSTOMER,
                            now,
                            now),
                    new Customer("6",
                                    "Dana",
                                    "customer7",
                                    "Allen",
                                    "Foster",
                                    LocalDate.of(2002,8,2),
                                    "+4486451439",
                            "8",
                                    Discount.MILITARY,
                                    now,
                            now),
                    new Customer(
                            "Dana",
                            "customer8",
                            "Allen",
                            "Foster",
                            LocalDate.of(2002,8,2),
                            "+4486451439",
                            "3",
                            Discount.NO
                            )

            ) );
    @Autowired
    CustomerMongoRepository repository;
  // @PostConstruct
    void init(){
      repository.saveAll(clients);
    }

    public List<Customer> getAllClients(){
        return repository.findAll();
    }

    public Customer getOneById(String id){
        return repository.findById(id).orElse(null);}

    public Customer create(Customer customer){
        customer.setCreatedAt(LocalDateTime.now());
        Customer clientFromDB = repository.save(customer);
        System.out.println(customer.getId());
        return  clientFromDB;}

    public Customer update(Customer customer){
        customer.setUpdatedAt(LocalDateTime.now());
        String id = customer.getId();
        customer.setCreatedAt(repository.findById(id).orElse(null).getCreatedAt());
        return repository.save(customer);}

    public void delete(String id){
        repository.deleteById(id);}

    /*public List<Customer> getAllByName(String name){
        return this.getAllClients().stream()
                .filter(item -> item.getName().equals(name))
                .collect(Collectors.toList());
    }*/



}
