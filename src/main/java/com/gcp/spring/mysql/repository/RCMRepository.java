package com.gcp.spring.mysql.repository;

import com.gcp.spring.mysql.model.RCM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCMRepository extends JpaRepository<RCM, Integer> {
}
