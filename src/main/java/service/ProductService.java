package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import entity.ProductRepository;

@Service
public class ProductService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

}
