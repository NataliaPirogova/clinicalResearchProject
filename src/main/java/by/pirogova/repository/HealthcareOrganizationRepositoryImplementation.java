package by.pirogova.repository;

import by.pirogova.model.HealthcareOrganization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HealthcareOrganizationRepositoryImplementation implements HealthcareOrganizationRepository {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, HealthcareOrganization> healthcareOrganizationMap = new HashMap<>();

    static {
        HealthcareOrganization ho1 = new HealthcareOrganization();
        ho1.setId(AUTO_ID.getAndIncrement());
        ho1.setName("1st clinic");
        ho1.setEmail("info@1p.by");
        ho1.setPhone("(017)323-23-11");
        healthcareOrganizationMap.put(ho1.getId(), ho1);

        HealthcareOrganization ho2 = new HealthcareOrganization();
        ho1.setId(AUTO_ID.getAndIncrement());
        ho1.setName("2nd clinic");
        ho1.setEmail("info@2p.by");
        ho1.setPhone("(017)130-31-31");
        healthcareOrganizationMap.put(ho2.getId(), ho2);
    }

    @Override
    public List<HealthcareOrganization> allHealthcareOrganizations() {
        return new ArrayList<>(healthcareOrganizationMap.values());
    }

    @Override
    public void addHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganization.setId(AUTO_ID.getAndIncrement());
        healthcareOrganizationMap.put(healthcareOrganization.getId(), healthcareOrganization);
    }

    @Override
    public void deleteHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganizationMap.remove(healthcareOrganization.getId());
    }

    @Override
    public void editHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        healthcareOrganizationMap.put(healthcareOrganization.getId(), healthcareOrganization);
    }

    @Override
    public HealthcareOrganization getHealthcareOrganizationById(int id) {
        return healthcareOrganizationMap.get(id);
    }
}
