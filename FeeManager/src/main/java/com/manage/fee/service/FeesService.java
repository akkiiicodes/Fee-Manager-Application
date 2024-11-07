package com.manage.fee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.manage.fee.entity.Fees;
import com.manage.fee.repo.FeesPaidRepo;
import com.manage.fee.repo.FeesRepo;

@Service
public class FeesService {

	private FeesRepo feesRepo;
	private FeesPaidRepo feesPaidRepo;

	public FeesService(FeesRepo feesRepo, FeesPaidRepo feesPaidRepo) {
		super();
		this.feesRepo = feesRepo;
		this.feesPaidRepo = feesPaidRepo;
	}

	public List<Fees> getAllFees() {

		return feesRepo.findAll();
	}

	public Fees getFees(String id) {
		Optional<Fees> optionalFees = feesRepo.findById(id);
		if (optionalFees.isPresent()) {
			return optionalFees.get();
		}

		return null;
	}
}
