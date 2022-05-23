package hw.springhw2.controller;/*
  @author   User
  @project   spring-hw2
  @class  HelloControler
  @version  1.0.0 
  @since 01.05.2022 - 14.24
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {
    @GetMapping("/myTermPaper")
    String getTermPaper(){
    String paper = "index.html";
    return paper;

    }

}
