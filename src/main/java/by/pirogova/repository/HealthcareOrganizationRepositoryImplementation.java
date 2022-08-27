package by.pirogova.repository;

import by.pirogova.model.HealthcareOrganization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HealthcareOrganizationRepositoryImplementation implements HealthcareOrganizationRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public HealthcareOrganizationRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<HealthcareOrganization> allHealthcareOrganizations() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from HealthcareOrganization", HealthcareOrganization.class).list();
    }

    @Override
    public void addHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(healthcareOrganization);
    }

    @Override
    public void deleteHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(healthcareOrganization);
    }

    @Override
    public void editHealthcareOrganization(HealthcareOrganization healthcareOrganization) {
        Session session = sessionFactory.getCurrentSession();
        session.update(healthcareOrganization);
    }

    @Override
    public HealthcareOrganization getHealthcareOrganizationById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(HealthcareOrganization.class, id);
    }
}
