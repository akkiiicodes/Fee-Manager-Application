package com.manage.fee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.fee.entity.FeesPaid;

@Repository
public interface FeesPaidRepo extends JpaRepository<FeesPaid, String> {

}
