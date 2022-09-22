package by.pirogova.service;

import by.pirogova.model.Medicine;
import by.pirogova.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicineServiceImplementation implements MedicineService {

    MedicineRepository medicineRepository;

    @Autowired
    public MedicineServiceImplementation(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public void add(Medicine medicine) {
        medicineRepository.add(medicine);
    }

    @Override
    public void edit(Medicine medicine) {
        medicineRepository.edit(medicine);
    }

    @Override
    public void delete(Medicine medicine) {
        medicineRepository.delete(medicine);
    }

    @Override
    public List<Medicine> allMedicines() {
        return medicineRepository.allMedicines();
    }

    @Override
    public Medicine getMedicineById(int id) {
        return medicineRepository.getMedicineById(id);
    }

    @Override
    public int medicineCount() {
        return medicineRepository.medicineCount();
    }
}
