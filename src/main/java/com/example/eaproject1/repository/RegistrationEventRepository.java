package com.example.eaproject1.repository;


import com.example.eaproject1.domian.RegistrationEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface RegistrationEventRepository extends JpaRepository<RegistrationEvent,Long> {
    @Query(value = "select r from RegistrationEvent r order by r.startDate limit 1", nativeQuery = true)
    RegistrationEvent findOrderedByStartDate();
}
