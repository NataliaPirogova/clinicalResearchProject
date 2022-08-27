package by.pirogova.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "volunteercontactinformation")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int volunteerId;
    private String firstName;//имя
    private String lastName;//фамилия
    private String middleName;//отчество
    private LocalDateTime DoB;//дата рождения
    private Gender gender;//пол
    private long phoneNumber;
    private String email;

    public Volunteer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDateTime getDoB() {
        return DoB;
    }

    @Column(name = "dateOfBirth")
    public void setDoB(LocalDateTime doB) {
        DoB = doB;
    }

    @Column(name = "dateOfBirth")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

enum Gender {
    MALE, FEMALE
}
