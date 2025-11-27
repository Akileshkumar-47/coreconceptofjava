package association;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="addresses")
public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String city,state,oin;
	public Address() {
		
	}
	public Address(String city, String state, String oin) {
		super();
		this.city = city;
		this.state = state;
		this.oin = oin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOin() {
		return oin;
	}
	public void setOin(String oin) {
		this.oin = oin;
	}
	
	

}
