package by.pirogova.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MedicineManufacturer {
    @Id
    private int id;
    private String name;
    private String site;
    private String email;
    private String countryOfOrigin;
    private String city;

}
