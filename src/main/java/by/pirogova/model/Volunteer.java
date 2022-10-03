package by.pirogova.model;

import by.pirogova.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;//имя
    private String lastName;//фамилия
    private String middleName;//отчество
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate doB;//дата рождения
    @Enumerated(EnumType.STRING)
    private Gender gender;//пол
    private long phoneNumber;
    private String email;
    @OneToOne(mappedBy = "volunteer")
    private VolunteerHabitsInfo volunteerHabitsInfo;
    @OneToOne(mappedBy = "volunteer")
    private VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo;
}