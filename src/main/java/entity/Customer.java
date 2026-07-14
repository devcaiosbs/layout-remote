package entity;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Long id;
	private final String name;
	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}
