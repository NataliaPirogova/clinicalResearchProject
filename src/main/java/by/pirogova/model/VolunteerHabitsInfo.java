package by.pirogova.model;

import javax.persistence.*;

@Entity
public class VolunteerHabitsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Smoking smoking;
    @Enumerated(EnumType.STRING)
    private TakingDrugs takingDrugs;
    private boolean takingMedicines;
    private boolean isPregnantNow;
    @Enumerated(EnumType.STRING)
    private PlanningPregnancy isPlanningPregnancy;
    private boolean Vegetarian;
    private boolean takingHormonalContraceptives;
    private Sport sport;
    private Alcohol alcohol;
    @OneToOne
    private Volunteer volunteer;

    public VolunteerHabitsInfo() {
    }

    public VolunteerHabitsInfo(Smoking smoking, TakingDrugs takingDrugs, boolean takingMedicines, boolean isPregnantNow, PlanningPregnancy isPlanningPregnancy, boolean vegetarian, boolean takingHormonalContraceptives, Sport sport, Alcohol alcohol) {
        this.smoking = smoking;
        this.takingDrugs = takingDrugs;
        this.takingMedicines = takingMedicines;
        this.isPregnantNow = isPregnantNow;
        this.isPlanningPregnancy = isPlanningPregnancy;
        Vegetarian = vegetarian;
        this.takingHormonalContraceptives = takingHormonalContraceptives;
        this.sport = sport;
        this.alcohol = alcohol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Smoking getSmoking() {
        return smoking;
    }

    public void setSmoking(Smoking smoking) {
        this.smoking = smoking;
    }

    public TakingDrugs getTakingDrugs() {
        return takingDrugs;
    }

    public void setTakingDrugs(TakingDrugs takingDrugs) {
        this.takingDrugs = takingDrugs;
    }

    public boolean isTakingMedicines() {
        return takingMedicines;
    }

    public void setTakingMedicines(boolean takingMedicines) {
        this.takingMedicines = takingMedicines;
    }

    public boolean isPregnantNow() {
        return isPregnantNow;
    }

    public void setPregnantNow(boolean pregnantNow) {
        isPregnantNow = pregnantNow;
    }

    public PlanningPregnancy getIsPlanningPregnancy() {
        return isPlanningPregnancy;
    }

    public void setIsPlanningPregnancy(PlanningPregnancy isPlanningPregnancy) {
        this.isPlanningPregnancy = isPlanningPregnancy;
    }

    public boolean isVegetarian() {
        return Vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        Vegetarian = vegetarian;
    }

    public boolean isTakingHormonalContraceptives() {
        return takingHormonalContraceptives;
    }

    public void setTakingHormonalContraceptives(boolean takingHormonalContraceptives) {
        this.takingHormonalContraceptives = takingHormonalContraceptives;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
}