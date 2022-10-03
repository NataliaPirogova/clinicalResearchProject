package by.pirogova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicineManufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String site;
    private String email;
    private String countryOfOrigin;
    private String city;
    @OneToMany(mappedBy = "manufacturer")
    private List<Medicine> medicineList;
}
