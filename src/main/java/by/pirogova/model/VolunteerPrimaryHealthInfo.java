package by.pirogova.model;

import javax.persistence.*;

@Entity
public class VolunteerPrimaryHealthInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int height;
    private int weight;
    private int pulse;
    private int bloodPressureSystolic;
    private int bloodPressureDiastolic;
    @OneToOne
    private Volunteer volunteer;

    public VolunteerPrimaryHealthInfo() {
    }

    public VolunteerPrimaryHealthInfo(int height, int weight, int pulse, int bloodPressureSystolic, int bloodPressureDiastolic) {
        this.height = height;
        this.weight = weight;
        this.pulse = pulse;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(int bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public int getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(int bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
}
