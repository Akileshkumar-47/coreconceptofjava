package HBCCritieas;


import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="Emps")
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	private String city;
	@ManyToMany
	private Set<Project> projects;
	@ManyToMany
	private Department department;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	


}

