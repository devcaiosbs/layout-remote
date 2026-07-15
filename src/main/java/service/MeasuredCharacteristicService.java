package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import repository.MeasuredCharacteristicRepository;

@Service
public class MeasuredCharacteristicService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final MeasuredCharacteristicRepository repository;

	public MeasuredCharacteristicService(MeasuredCharacteristicRepository repository) {
		this.repository = repository;
	}

}
