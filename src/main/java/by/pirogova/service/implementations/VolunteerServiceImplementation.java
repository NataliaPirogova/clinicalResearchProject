package by.pirogova.service.implementations;

import by.pirogova.model.Volunteer;
import by.pirogova.repository.interfaces.VolunteerRepository;
import by.pirogova.service.interfaces.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
    public Volunteer addVolunteer(Volunteer volunteer) {
        return volunteerRepository.addVolunteer(volunteer);
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
