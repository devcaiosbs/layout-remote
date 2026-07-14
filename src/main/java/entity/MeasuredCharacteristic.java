package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import entity.enums.Result;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class MeasuredCharacteristic implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	private BigDecimal measuredValue;
	@NotNull
	private Result result;
	private Requirement requirement;
	public MeasuredCharacteristic(Long id, BigDecimal measuredValue, Result result, Requirement requirement) {
		this.id = id;
		this.measuredValue = measuredValue;
		this.result = result;
		this.requirement = requirement;
	}
	public Long getId() {
		return id;
	}
	public BigDecimal getMeasuredValue() {
		return measuredValue;
	}
	public Result getResult() {
		return result;
	}
	public Requirement getRequirement() {
		return requirement;
	}
	public void setMeasuredValue(BigDecimal measuredValue) {
		this.measuredValue = measuredValue;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
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
		MeasuredCharacteristic other = (MeasuredCharacteristic) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
