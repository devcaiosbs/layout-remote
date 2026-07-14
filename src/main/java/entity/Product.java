package entity;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private String name;
	private String partNumber;
	private Customer customer;
	private Material material;
	private boolean isAtive;
	private boolean isPA;

	public Product(Long id, String name, String partNumber, Customer customer, Material material, boolean isAtive,
			boolean isPA) {
		this.id = id;
		this.name = name;
		this.partNumber = partNumber;
		this.customer = customer;
		this.material = material;
		this.isAtive = isAtive;
		this.isPA = isPA;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Material getMaterial() {
		return material;
	}

	public boolean isAtive() {
		return isAtive;
	}

	public boolean isPA() {
		return isPA;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setAtive(boolean isAtive) {
		this.isAtive = isAtive;
	}

	public void setPA(boolean isPA) {
		this.isPA = isPA;
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
