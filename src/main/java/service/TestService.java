package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import repository.TestRepository;

@Service
public class TestService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final TestRepository repository;

	public TestService(TestRepository repository) {
		this.repository = repository;
	}

}
