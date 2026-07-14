package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Standard implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	@NotBlank
	private String name;
	private LocalDate lastEdition;
	private Customer customer;
	private final List<Test> tests = new ArrayList<>();

	public Standard(Long id, String name, LocalDate lastEdtion, Customer customer) {
		this.id = id;
		this.name = name;
		this.lastEdition = lastEdtion;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getLastEdition() {
		return lastEdition;
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

	public void setLastEdition(LocalDate lastEdition) {
		this.lastEdition = lastEdition;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void addTest(Test test) {
		this.tests.add(test);
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
