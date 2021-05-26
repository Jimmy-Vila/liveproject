package com.example.salonapi.AppController;


import com.example.salonapi.Repository.SalonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SalonController {

    private SalonRepository salonRepository;

    @GetMapping("/")
    public String intro() {
        return "Intro page";
    }


    public SalonController(SalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    @GetMapping("/salon")
    public String orderForm() {
        return "orderForm";
    }



}
