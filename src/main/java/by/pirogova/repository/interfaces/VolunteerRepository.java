package by.pirogova.repository.interfaces;

import by.pirogova.model.Volunteer;

import java.util.List;

public interface VolunteerRepository {
    List<Volunteer> allVolunteers();

    void addVolunteer(Volunteer volunteer);

    void editVolunteer(Volunteer volunteer);

    void deleteVolunteer(Volunteer volunteer);

    Volunteer getVolunteerByID(int id);
}
