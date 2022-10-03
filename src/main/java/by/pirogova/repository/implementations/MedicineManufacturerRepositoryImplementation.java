package by.pirogova.repository.implementations;

import by.pirogova.model.MedicineManufacturer;
import by.pirogova.repository.interfaces.MedicineManufacturerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MedicineManufacturerRepositoryImplementation implements MedicineManufacturerRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(MedicineManufacturer medicineManufacturer) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(medicineManufacturer);
    }

    @Override
    public void edit(MedicineManufacturer medicineManufacturer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(medicineManufacturer);
    }

    @Override
    public void delete(MedicineManufacturer medicineManufacturer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(medicineManufacturer);
    }

    @Override
    public List<MedicineManufacturer> allMedicineManufacturers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from MedicineManufacturer", MedicineManufacturer.class).list();
    }

    @Override
    public MedicineManufacturer getMedicineManufacturerById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MedicineManufacturer.class, id);
    }

    @Override
    public int medicineManufacturerCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from MedicineManufacturer ", Number.class)
                .getSingleResult().intValue();
    }
}
