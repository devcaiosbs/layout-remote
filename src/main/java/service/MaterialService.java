package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import repository.MaterialRepository;

@Service
public class MaterialService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final MaterialRepository repository;

	public MaterialService(MaterialRepository repository) {
		this.repository = repository;
	}

}
