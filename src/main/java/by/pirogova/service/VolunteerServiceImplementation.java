package by.pirogova.service;

import by.pirogova.model.Volunteer;
import by.pirogova.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImplementation implements VolunteerService {

    private VolunteerRepository volunteerRepository;

    @Autowired
    public VolunteerServiceImplementation(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    @Override
    public List<Volunteer> allVolunteers() {
        return volunteerRepository.allVolunteers();
    }

    @Override
    public void addVolunteer(Volunteer volunteer) {
        volunteerRepository.addVolunteer(volunteer);
    }

    @Override
    public void editVolunteer(Volunteer volunteer) {
        volunteerRepository.editVolunteer(volunteer);
    }

    @Override
    public void deleteVolunteer(Volunteer volunteer) {
        volunteerRepository.deleteVolunteer(volunteer);
    }

    @Override
    public Volunteer getVolunteerByID(int id) {
        return volunteerRepository.getVolunteerByID(id);
    }
}
