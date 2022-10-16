package by.pirogova.service.interfaces;

import by.pirogova.model.Medicine;

import java.util.List;

public interface MedicineService {
    Medicine add(Medicine medicine);

    void edit(Medicine medicine);

    void delete(Medicine medicine);

    List<Medicine> allMedicines();

    Medicine getMedicineById(int id);

    int medicineCount();
}
