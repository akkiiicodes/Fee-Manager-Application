package com.manage.fee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.fee.entity.Fees;

@Repository
public interface FeesRepo extends JpaRepository<Fees, String> {

}
