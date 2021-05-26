package com.example.salonapi.SalonServiceDetail;

import com.example.salonapi.SalonServiceDetail.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends CrudRepository<SalonServiceDetail, Long> {

}
