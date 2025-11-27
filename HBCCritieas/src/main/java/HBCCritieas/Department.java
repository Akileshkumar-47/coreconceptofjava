package HBCCritieas;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="depts")
public class Department {
	
	@Id
	
	private int id;
	private String name;
	private String location;
	@OneToMany(mappedBy="depts")
	private Set<Employee> employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	

}
