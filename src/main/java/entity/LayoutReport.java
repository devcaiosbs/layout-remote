package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class LayoutReport implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	private final LocalDate inspectionDay;
	private String notes;
	private Product product;

	public LayoutReport(Long id, LocalDate inspectionDay, String notes, Product product) {
		this.id = id;
		this.inspectionDay = inspectionDay;
		this.notes = notes;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getInspectionDay() {
		return inspectionDay;
	}

	public String getNotes() {
		return notes;
	}

	public Product getProduct() {
		return product;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setProduct(Product product) {
		this.product = product;
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
		LayoutReport other = (LayoutReport) obj;
		return Objects.equals(id, other.id);
	}
}
