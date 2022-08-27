package by.pirogova.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "healthcareorganizations")
public class HealthcareOrganization {
    private String name;
    private String email;
    private long phone;
    @Id
    @Column(name = "healthcareorganizationID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public HealthcareOrganization() {
    }

    @Override
    public String toString() {
        return "HealthcareOrganization{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }
}
