package com.example.salonapi.Slot;


import com.example.salonapi.SalonService.SalonService;
import com.example.salonapi.SalonService.SalonServiceDetail;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.graalvm.compiler.word.Word;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:3000")


public class SlotController {

    SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }
    @GetMapping("/retrieveAvailableSlots/{salonServiceId}/{formattedDate}")
    @ApiOperation(value = "RetrieveAvailableSlotsAPI")
    public List<Slot>RetrieveAvailableSlotsAPI(@PathVariable Long salonServiceId, @ApiParam(value = "Date in yyyy-MM-dd format", required = true, defaultValue = "2020-11-21") @PathVariable String formattedDate) {
        return slotService.getAllServicesOnDate(salonServiceId, formattedDate);
    }

}
