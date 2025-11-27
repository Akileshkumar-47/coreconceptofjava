package curdapplication;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="Stu_Data")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roll;

    private String name;
    private LocalDate dob;
    private float percentage;

    // ✅ Hibernate requires a no-argument constructor
    public Student() {
    }

    // Your custom constructor
    public Student(String name, LocalDate dob, float percentage) {
        this.name = name;
        this.dob = dob;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", dob=" + dob + ", percentage=" + percentage + "]";
    }

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}

