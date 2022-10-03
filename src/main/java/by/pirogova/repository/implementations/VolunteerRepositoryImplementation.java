package by.pirogova.repository.implementations;

import by.pirogova.model.Volunteer;
import by.pirogova.repository.interfaces.VolunteerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VolunteerRepositoryImplementation implements VolunteerRepository {

    SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Volunteer> allVolunteers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Volunteer", Volunteer.class).list();
    }

    @Override
    public void addVolunteer(Volunteer volunteer) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(volunteer);
    }

    @Override
    public void editVolunteer(Volunteer volunteer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(volunteer);
    }

    @Override
    public void deleteVolunteer(Volunteer volunteer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(volunteer);
    }

    @Override
    public Volunteer getVolunteerByID(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Volunteer.class, id);
    }
}