package by.pirogova.repository.interfaces;

import by.pirogova.model.HealthcareOrganization;

import java.util.List;

public interface HealthcareOrganizationRepository {
    List<HealthcareOrganization> allHealthcareOrganizations();

    void addHealthcareOrganization(HealthcareOrganization healthcareOrganization);

    void deleteHealthcareOrganization(HealthcareOrganization healthcareOrganization);

    void editHealthcareOrganization(HealthcareOrganization healthcareOrganization);

    HealthcareOrganization getHealthcareOrganizationById(int id);
}
