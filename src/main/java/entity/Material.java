package entity;

import java.io.Serializable;
import java.util.Objects;

public class Material implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private String name;
	private String code;
	private String plant;

	public Material(Long id, String name, String code, String plant) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.plant = plant;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getPlant() {
		return plant;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPlant(String plant) {
		this.plant = plant;
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
		Material other = (Material) obj;
		return Objects.equals(id, other.id);
	}
}
