package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import entity.enums.Operator;

public class Requirement implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String parameter;
	private Operator operator;
	private BigDecimal value;
	private BigDecimal tolerance;
	private String unit;
	
	public Requirement(Long id, String parameter, Operator operator, BigDecimal value, BigDecimal tolerance,
			String unit) {
		this.id = id;
		this.parameter = parameter;
		this.operator = operator;
		this.value = value;
		this.tolerance = tolerance;
		this.unit = unit;
	}
	public Long getId() {
		return id;
	}
	public String getParameter() {
		return parameter;
	}
	public Operator getOperator() {
		return operator;
	}
	public BigDecimal getValue() {
		return value;
	}
	public BigDecimal getTolerance() {
		return tolerance;
	}
	public String getUnit() {
		return unit;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public void setTolerance(BigDecimal tolerance) {
		this.tolerance = tolerance;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
		Requirement other = (Requirement) obj;
		return Objects.equals(id, other.id);
	}
}
