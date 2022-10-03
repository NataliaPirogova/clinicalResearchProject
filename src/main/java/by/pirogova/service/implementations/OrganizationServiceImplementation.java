package by.pirogova.service.implementations;

import by.pirogova.model.HealthcareOrganization;
import by.pirogova.repository.interfaces.HealthcareOrganizationRepository;
import by.pirogova.service.interfaces.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrganizationServiceImplementation implements OrganizationService {

    private final HealthcareOrganizationRepository healthcareOrganizationRepository;

    @Autowired
    public OrganizationServiceImplementation(HealthcareOrganizationRepository healthcareOrganizationRepository) {
        this.healthcareOrganizationRepository = healthcareOrganizationRepository;
    }

    @Override
    public List<HealthcareOrganization> allHealthcareOrganizations() {
        return healthcareOrganizationRepository.allHealthcareOrganizations();
    }

    @Override
    public void addHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganizationRepository.addHealthcareOrganization(healthcareOrganization);
    }

    @Override
    public void deleteHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganizationRepository.deleteHealthcareOrganization(healthcareOrganization);
    }

    @Override
    public void editHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganizationRepository.editHealthcareOrganization(healthcareOrganization);
    }

    @Override
    public HealthcareOrganization getHealthcareOrganizationById(int id) {
        return healthcareOrganizationRepository.getHealthcareOrganizationById(id);
    }
}
