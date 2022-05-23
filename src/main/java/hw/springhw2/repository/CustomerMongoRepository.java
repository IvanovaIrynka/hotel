package hw.springhw2.repository;/*
  @author   User
  @project   spring-hw2
  @class  CustomerMongoRepository
  @version  1.0.0 
  @since 16.03.2022 - 22.37
*/

import hw.springhw2.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {

}
