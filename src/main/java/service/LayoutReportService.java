package service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import repository.LayoutReportRepository;

@Service
public class LayoutReportService implements Serializable {

	private static final long serialVersionUID = 1L;
	private final LayoutReportRepository repository;

	public LayoutReportService(LayoutReportRepository repository) {
		this.repository = repository;
	}

}
