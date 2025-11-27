package mysql;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentdata")
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int roll;
	String name,city,course;
	float marks;
	@Column(name="stumark")
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}
