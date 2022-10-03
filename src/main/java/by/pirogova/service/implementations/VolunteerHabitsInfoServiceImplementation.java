package by.pirogova.service.implementations;

import by.pirogova.model.VolunteerHabitsInfo;
import by.pirogova.repository.interfaces.VolunteerHabitsInfoRepository;
import by.pirogova.service.interfaces.VolunteerHabitsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VolunteerHabitsInfoServiceImplementation implements VolunteerHabitsInfoService {

    private VolunteerHabitsInfoRepository volunteerHabitsInfoRepository;

    @Autowired
    public VolunteerHabitsInfoServiceImplementation(VolunteerHabitsInfoRepository volunteerHabitsInfoRepository) {
        this.volunteerHabitsInfoRepository = volunteerHabitsInfoRepository;
    }

    @Override
    public void addVolunteerHabitsInfo(VolunteerHabitsInfo volunteerHabitsInfo) {
        volunteerHabitsInfoRepository.addVolunteerHabitsInfo(volunteerHabitsInfo);
    }

    @Override
    public void editVolunteerHabitsInfo(VolunteerHabitsInfo volunteerHabitsInfo) {
        volunteerHabitsInfoRepository.editVolunteerHabitsInfo(volunteerHabitsInfo);
    }
}
