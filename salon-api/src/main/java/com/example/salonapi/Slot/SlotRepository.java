package com.example.salonapi.Slot;

import com.example.salonapi.SalonService.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SlotRepository extends CrudRepository<Slot, Long> {
    List<Slot> findAllBySlotForGreaterThanEqualAndSlotForLessThanEqualAndAvailableServicesContainingAndStatus(LocalDateTime startTime, LocalDateTime endTime, SalonServiceDetail serviceDetail, SlotStatus status);

}
