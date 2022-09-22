package by.pirogova.repository;

import by.pirogova.model.VolunteerPrimaryHealthInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VolunteerPrimaryHealthInfoRepositoryImplementation implements VolunteerPrimaryHealthInfoRepository {

    SessionFactory sessionFactory;

    @Autowired
    public VolunteerPrimaryHealthInfoRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addVolunteerPrimaryHealthInfo(VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(volunteerPrimaryHealthInfo);
    }

    @Override
    public void editVolunteerPrimaryHealthInfo(VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.update(volunteerPrimaryHealthInfo);
    }
}
