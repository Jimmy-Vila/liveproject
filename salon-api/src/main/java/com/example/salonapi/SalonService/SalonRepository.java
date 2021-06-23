package com.example.salonapi.SalonService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SalonRepository extends CrudRepository<SalonServiceDetail, Long> {
  List<SalonServiceDetail> findAll();
}
