package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import repository.CustomerRepository;

@Service
public class CustomerService implements Serializable {

	private static final long serialVersionUID = 1L;

	private final CustomerRepository repository;

	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
	}

}
