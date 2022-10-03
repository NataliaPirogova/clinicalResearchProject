package by.pirogova.service.implementations;

import by.pirogova.model.VolunteerPrimaryHealthInfo;
import by.pirogova.repository.interfaces.VolunteerPrimaryHealthInfoRepository;
import by.pirogova.service.interfaces.VolunteerPrimaryHealthInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VolunteerPrimaryHealthInfoServiceImplementation implements VolunteerPrimaryHealthInfoService {

    VolunteerPrimaryHealthInfoRepository volunteerPrimaryHealthInfoRepository;

    @Autowired
    public VolunteerPrimaryHealthInfoServiceImplementation(VolunteerPrimaryHealthInfoRepository volunteerPrimaryHealthInfoRepository) {
        this.volunteerPrimaryHealthInfoRepository = volunteerPrimaryHealthInfoRepository;
    }

    @Override
    public void addVolunteerPrimaryHealthInfo(VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        volunteerPrimaryHealthInfoRepository.addVolunteerPrimaryHealthInfo(volunteerPrimaryHealthInfo);
    }

    @Override
    public void editVolunteerPrimaryHealthInfo(VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        volunteerPrimaryHealthInfoRepository.editVolunteerPrimaryHealthInfo(volunteerPrimaryHealthInfo);
    }
}