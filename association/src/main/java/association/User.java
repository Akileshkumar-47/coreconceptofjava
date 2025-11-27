package association;

import jakarta.persistence.*;


@Entity
@Table(name="userdata")

public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	public 	User() {
		
	}
	public User(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
