package by.pirogova.controller;

import by.pirogova.model.Medicine;
import by.pirogova.model.MedicineManufacturer;
import by.pirogova.service.interfaces.MedicineManufacturerService;
import by.pirogova.service.interfaces.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/medicine")
public class MedicineController {
    private final MedicineService medicineService;
    private final MedicineManufacturerService medicineManufacturerService;

    @Autowired
    public MedicineController(MedicineService medicineService, MedicineManufacturerService medicineManufacturerService) {
        this.medicineService = medicineService;
        this.medicineManufacturerService = medicineManufacturerService;
    }

    @GetMapping
    public ModelAndView allMedicinePage() {
        ModelAndView modelAndView = new ModelAndView();
        List<Medicine> medicines = medicineService.allMedicines();
        modelAndView.addObject("medicines", medicines);
        modelAndView.setViewName("medicineAll");
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView registrationMedicinePage() {
        //можно выносить в VC config ????
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationMedicine");
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public ModelAndView registrationMedicine(@ModelAttribute("medicine") Medicine medicine) {
        ModelAndView modelAndView = new ModelAndView();
        medicineService.add(medicine);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @GetMapping(value = "/registerManufacturer")
    public ModelAndView registrationMedicineManufacturer() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registerManufacturer");
        return modelAndView;
    }

    @PostMapping(value = "/registerManufacturer")
    public ModelAndView registrationMedicineManufacturer(@ModelAttribute("manufacturer") MedicineManufacturer manufacturer) {
        ModelAndView modelAndView = new ModelAndView();
        medicineManufacturerService.add(manufacturer);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("medicine", new Medicine());
        model.addAttribute("manufacturer", new MedicineManufacturer());
    }
}
