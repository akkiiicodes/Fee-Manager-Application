package com.manage.fee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.manage.fee.entity.Fees;
import com.manage.fee.entity.FeesPaid;
import com.manage.fee.repo.FeesPaidRepo;
import com.manage.fee.repo.FeesRepo;

@Service
public class FeesPaidService {

	private FeesRepo feesRepo;
	private FeesPaidRepo feesPaidRepo;

	public FeesPaidService(FeesRepo feesRepo, FeesPaidRepo feesPaidRepo) {
		super();
		this.feesRepo = feesRepo;
		this.feesPaidRepo = feesPaidRepo;
	}

	public List<FeesPaid> getAllFeesPaid() {

		return feesPaidRepo.findAll();
	}
	
	public List<FeesPaid> getAllFeesPaidPageable(int page, int size) {
		Pageable pageable = PageRequest.of(page-1, size);
		Page<FeesPaid> pageFeesPaid = feesPaidRepo.findAll(pageable);
		
		return pageFeesPaid.getContent();
	}

	public FeesPaid getFeesPaid(String id) {
		Optional<FeesPaid> optionalFees = feesPaidRepo.findById(id);
		if (optionalFees.isPresent()) {
			return optionalFees.get();
		}

		return null;
	}
}
