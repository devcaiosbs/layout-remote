package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Standard implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private String name;
	private LocalDate lastEdtion;
	private Customer customer;
	private final List<Test> tests = new ArrayList<>();

	public Standard(Long id, String name, LocalDate lastEdtion, Customer customer) {
		this.id = id;
		this.name = name;
		this.lastEdtion = lastEdtion;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getLastEdtion() {
		return lastEdtion;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastEdtion(LocalDate lastEdtion) {
		this.lastEdtion = lastEdtion;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Standard other = (Standard) obj;
		return Objects.equals(id, other.id);
	}
}
