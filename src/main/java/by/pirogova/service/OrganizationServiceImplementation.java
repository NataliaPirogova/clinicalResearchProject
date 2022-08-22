package by.pirogova.service;

import by.pirogova.model.HealthcareOrganization;
import by.pirogova.repository.HealthcareOrganizationRepository;
import by.pirogova.repository.HealthcareOrganizationRepositoryImplementation;

import java.util.List;

public class OrganizationServiceImplementation implements OrganizationService {

    private final HealthcareOrganizationRepository healthcareOrganizationRepository = new HealthcareOrganizationRepositoryImplementation();

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
