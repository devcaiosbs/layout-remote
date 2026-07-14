package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private String name;
	private String partNumber;
	private boolean isAtive;
	private boolean isPA;
	private LocalDate lastInspection;

	private Customer customer;
	private Material material;
	private List<Standard> standards = new ArrayList<>();

	public Product(Long id, String name, String partNumber, boolean isAtive, boolean isPA, Customer customer,
			LocalDate lastInspection, Material material, List<Standard> standards) {
		this.id = id;
		this.name = name;
		this.partNumber = partNumber;
		this.isAtive = isAtive;
		this.isPA = isPA;
		this.customer = customer;
		this.material = material;
		this.standards = standards;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public boolean isAtive() {
		return isAtive;
	}

	public boolean isPA() {
		return isPA;
	}

	public LocalDate getLastInspection() {
		return lastInspection;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Material getMaterial() {
		return material;
	}

	public List<Standard> getStandards() {
		return standards;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setAtive(boolean isAtive) {
		this.isAtive = isAtive;
	}

	public void setPA(boolean isPA) {
		this.isPA = isPA;
	}

	public void setLastInspection(LocalDate lastInspection) {
		this.lastInspection = lastInspection;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setStandards(List<Standard> standards) {
		this.standards = standards;
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
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
}
