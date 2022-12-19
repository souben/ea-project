package com.example.eaproject1.repository;



import com.example.eaproject1.domian.RegistrationGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationGroupRepository extends JpaRepository<RegistrationGroup,Long> {
}