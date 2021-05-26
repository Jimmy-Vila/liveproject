package com.example.salonapi;


import com.example.salonapi.SalonServiceDetail.SalonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SalonController {


    @GetMapping("/")
    public String intro() {
        return "Intro page";
    }


    @GetMapping("/salon")
    public String test() {
        return "salon string";
    }



}
