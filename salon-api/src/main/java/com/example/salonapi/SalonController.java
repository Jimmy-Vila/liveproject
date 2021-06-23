package com.example.salonapi;


import com.example.salonapi.SalonServiceDetail.SalonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RestController

public class SalonController {

    @GetMapping("/api/services/retrieveAvailableSalonServices")
    public String t() {
        return "Intro page";
    }



    @GetMapping("/salon")
    public String test() {
        return "salon string";
    }



}
