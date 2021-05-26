package com.example.salonapi.Repository;

import com.example.salonapi.Entity.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends CrudRepository<SalonServiceDetail, Long> {

}
