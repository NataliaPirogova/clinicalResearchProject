package by.pirogova.repository;

import by.pirogova.model.VolunteerHabitsInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VolunteerHabitsInfoRepositoryImplementation implements VolunteerHabitsInfoRepository {

    SessionFactory sessionFactory;

    @Autowired
    public VolunteerHabitsInfoRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addVolunteerHabitsInfo(VolunteerHabitsInfo volunteerHabitsInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(volunteerHabitsInfo);
    }

    @Override
    public void editVolunteerHabitsInfo(VolunteerHabitsInfo volunteerHabitsInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.update(volunteerHabitsInfo);
    }
}
