package com.manage.fee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.fee.entity.Standard;

@Repository
public interface StandardRepo extends JpaRepository<Standard, String> {

}
