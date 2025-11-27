package onetomanyasscoiation;

import jakarta.persistence.*;

@Entity
@Table(name="empolyee")

public class Empolyee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double salary;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;
	
	public Empolyee() {
		
	}
	
	public Empolyee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
