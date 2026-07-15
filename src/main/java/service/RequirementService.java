package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import entity.Requirement;
import repository.RequirementRepository;

@Service
public class RequirementService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final RequirementRepository repository;

	public RequirementService(RequirementRepository repository) {
		this.repository = repository;
	}

}
