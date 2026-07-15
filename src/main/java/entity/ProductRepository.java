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
public class ProductRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	@NotBlank
	private String name;
	@NotBlank
	private final String partNumber;
	private boolean isActive;
	private boolean hasAnnualInspection; // 
	private LocalDate lastInspection;
	private String plant;

	private Customer customer;
	private Material material;
	private final List<Standard> standards = new ArrayList<>();

	public ProductRepository(Long id, String name, String partNumber, boolean isActive, boolean hasAnnualInspection, Customer customer,
			LocalDate lastInspection, String plant, Material material) {
		this.id = id;
		this.name = name;
		this.partNumber = partNumber;
		this.isActive = isActive;
		this.hasAnnualInspection = hasAnnualInspection;
		this.lastInspection = lastInspection;
		this.plant = plant;
		this.customer = customer;
		this.material = material;
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

	public boolean isActive() {
		return isActive;
	}

	public boolean hasAnnualInspection() {
		return hasAnnualInspection;
	}

	public LocalDate getLastInspection() {
		return lastInspection;
	}

	public String getPlant() {
		return plant;
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

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void hasAnnualInspection(boolean hasAnnualInspection) {
		this.hasAnnualInspection = hasAnnualInspection;
	}

	public void setLastInspection(LocalDate lastInspection) {
		this.lastInspection = lastInspection;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void addStandard(Standard standard) {
		this.standards.add(standard);
	}

	public void removeStandard(Standard standard) {
		standards.remove(standard);
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
		ProductRepository other = (ProductRepository) obj;
		return Objects.equals(id, other.id);
	}
}
