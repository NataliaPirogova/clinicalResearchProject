package by.pirogova.service.interfaces;

import by.pirogova.model.MedicineManufacturer;

import java.util.List;

public interface MedicineManufacturerService {
    MedicineManufacturer add(MedicineManufacturer medicineManufacturer);

    void edit(MedicineManufacturer medicineManufacturer);

    void delete(MedicineManufacturer medicineManufacturer);

    List<MedicineManufacturer> allMedicineManufacturers();

    MedicineManufacturer getMedicineManufacturerById(int id);

    int medicineManufacturerCount();
}
