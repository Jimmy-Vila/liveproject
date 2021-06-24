package com.example.salonapi.Slot;

import com.example.salonapi.SalonService.SalonService;
import com.example.salonapi.SalonService.SalonServiceDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SlotService {

    SlotRepository slotRepository;
    SalonService salonService;

    public SlotService(SlotRepository slotRepository, SalonService salonService) {
        this.slotRepository = slotRepository;
        this.salonService = salonService;
    }

    public List<Slot> getAllServicesOnDate(Long slotServID, String formattedDate){
        SalonServiceDetail salonServiceDetail = salonService.findById(slotServID).orElseThrow(() -> new RuntimeException("service  not available"));

        LocalDate localDate = getAsDate(formattedDate);
        LocalDateTime startDate = localDate.atTime(0, 1);
        LocalDateTime endDate = localDate.atTime(23, 59);
        log.info("Querying for  " + slotServID + " From " + startDate + " to " + endDate);
        List<Slot> results = slotRepository.findAllBySlotForGreaterThanEqualAndSlotForLessThanEqualAndAvailableServicesContainingAndStatus(startDate, endDate, salonServiceDetail, SlotStatus.AVAILABLE);

        log.info("returning  " + results.size() + " Slots");
        return results;

    }


    public LocalDate getAsDate(String formattedDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(formattedDate, formatter);

    }
}
