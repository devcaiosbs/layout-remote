package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import entity.Standard;
import repository.StandardRepository;

@Service
public class StandardService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final StandardRepository repository;

	public StandardService(StandardRepository repository) {
		this.repository = repository;
	}

}
