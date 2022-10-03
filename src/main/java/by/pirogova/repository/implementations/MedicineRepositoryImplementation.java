package by.pirogova.repository.implementations;

import by.pirogova.model.Medicine;
import by.pirogova.repository.interfaces.MedicineRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicineRepositoryImplementation implements MedicineRepository {

    SessionFactory sessionFactory;

    @Autowired
    public MedicineRepositoryImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Medicine medicine) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(medicine);
    }

    @Override
    public void edit(Medicine medicine) {
        Session session = sessionFactory.getCurrentSession();
        session.update(medicine);
    }

    @Override
    public void delete(Medicine medicine) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(medicine);
    }

    @Override
    public List<Medicine> allMedicines() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Medicine", Medicine.class).list();
    }

    @Override
    public Medicine getMedicineById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Medicine.class, id);
    }

    @Override
    public int medicineCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from Medicine", Number.class).getSingleResult().intValue();
    }
}
