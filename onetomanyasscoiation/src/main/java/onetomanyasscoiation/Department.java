package onetomanyasscoiation;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Empolyee> employees = new ArrayList<>();

    // Default constructor
    public Department() {
    	
    }

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Empolyee e) {
        employees.add(e);
        e.setDepartment(this);
    }

    public void removeEmployee(Empolyee e) {
        employees.remove(e);
        e.setDepartment(null);
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

    public List<Empolyee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Empolyee> employees) {
        this.employees = employees;
    }
}
