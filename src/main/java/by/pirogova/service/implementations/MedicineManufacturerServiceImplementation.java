package by.pirogova.service.implementations;

import by.pirogova.model.MedicineManufacturer;
import by.pirogova.repository.interfaces.MedicineManufacturerRepository;
import by.pirogova.service.interfaces.MedicineManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MedicineManufacturerServiceImplementation implements MedicineManufacturerService {

    private MedicineManufacturerRepository medicineManufacturerRepository;

    @Autowired
    public MedicineManufacturerServiceImplementation(MedicineManufacturerRepository medicineManufacturerRepository) {
        this.medicineManufacturerRepository = medicineManufacturerRepository;
    }

    @Override
    public MedicineManufacturer add(MedicineManufacturer medicineManufacturer) {
        medicineManufacturerRepository.add(medicineManufacturer);
        return medicineManufacturer;
    }

    @Override
    public void edit(MedicineManufacturer medicineManufacturer) {
        medicineManufacturerRepository.edit(medicineManufacturer);
    }

    @Override
    public void delete(MedicineManufacturer medicineManufacturer) {
        medicineManufacturerRepository.delete(medicineManufacturer);
    }

    @Override
    public List<MedicineManufacturer> allMedicineManufacturers() {
        return medicineManufacturerRepository.allMedicineManufacturers();
    }

    @Override
    public MedicineManufacturer getMedicineManufacturerById(int id) {
        return medicineManufacturerRepository.getMedicineManufacturerById(id);
    }

    @Override
    public int medicineManufacturerCount() {
        return medicineManufacturerRepository.medicineManufacturerCount();
    }
}
