package entity;

import java.io.Serializable;
import java.util.Objects;

public class Test implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private String name;
	private Requirement requirement;

	public Test(Long id, String name, Requirement requiment) {
		this.id = id;
		this.name = name;
		this.requirement = requiment;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Requirement getRequiment() {
		return requirement;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRequiment(Requirement requiment) {
		this.requirement = requiment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, requirement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(requirement, other.requirement);
	}
}
