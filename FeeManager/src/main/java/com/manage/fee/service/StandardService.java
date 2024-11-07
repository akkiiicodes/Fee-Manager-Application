package com.manage.fee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.manage.fee.entity.Standard;
import com.manage.fee.repo.StandardRepo;

@Service
public class StandardService {

	private StandardRepo standardRepo;

	public StandardService(StandardRepo standardRepo) {
		super();
		this.standardRepo = standardRepo;
	}

	public List<Standard> getAllStandards() {

		return standardRepo.findAll();
	}

	public Standard getStandard(String id) {
		Optional<Standard> optionalStandard = standardRepo.findById(id);
		if (optionalStandard.isPresent()) {
			return optionalStandard.get();
		}

		return null;
	}

	public List<String> getStandardList() {
		List<String> standardList = new ArrayList<>();
		getAllStandards().forEach(st -> standardList.add(st.getStandardName()));

		return standardList;
	}
}
