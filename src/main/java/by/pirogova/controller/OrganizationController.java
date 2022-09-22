package by.pirogova.controller;
//
//import by.pirogova.aop.GeneralControllerGetMapping;
//import by.pirogova.model.HealthcareOrganization;

import by.pirogova.model.Medicine;
import by.pirogova.model.Volunteer;
import by.pirogova.model.VolunteerHabitsInfo;
import by.pirogova.model.VolunteerPrimaryHealthInfo;
import by.pirogova.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrganizationController {

    private static Logger logger = LoggerFactory.getLogger(OrganizationController.class);
    private final OrganizationService organizationService;
    private final VolunteerService volunteerService;
    private final VolunteerHabitsInfoService volunteerHabitsInfoService;
    private final VolunteerPrimaryHealthInfoService volunteerPrimaryHealthInfoService;
    private final MedicineService medicineService;
    private int page;

    @Autowired
    public OrganizationController(OrganizationService organizationService,
                                  VolunteerService volunteerService,
                                  VolunteerHabitsInfoService volunteerHabitsInfoService,
                                  VolunteerPrimaryHealthInfoService volunteerPrimaryHealthInfoService,
                                  MedicineService medicineService) {
        this.organizationService = organizationService;
        this.volunteerService = volunteerService;
        this.volunteerHabitsInfoService = volunteerHabitsInfoService;
        this.volunteerPrimaryHealthInfoService = volunteerPrimaryHealthInfoService;
        this.medicineService = medicineService;
    }

    @GetMapping(value = "/")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("volunteer", new Volunteer());
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/healthcareorganizations", method = RequestMethod.GET)
    public ModelAndView allOrganizations() {
        ModelAndView modelAndView = new ModelAndView();
//        List<HealthcareOrganization> organizationList = organizationService.allHealthcareOrganizations();
//        modelAndView.addObject("organizations", organizationList);
        modelAndView.setViewName("healthcareorganizations");
        return modelAndView;
    }

    @RequestMapping(value = "/registerVolunteer", method = RequestMethod.GET)
    public ModelAndView registerPageVolunteer() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteer");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteer")
    public ModelAndView registerVolunteer(@ModelAttribute("volunteer") Volunteer volunteer) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerService.addVolunteer(volunteer);
        modelAndView.setViewName("redirect:/registrationVolunteerPage2");
        return modelAndView;
    }

    @RequestMapping(value = "/registrationVolunteerPage2", method = RequestMethod.GET)
    public ModelAndView registerPageVolunteerHabits() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteerHabitsInfo");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteerPage2submit")
    public ModelAndView registerVolunteerHabits(@ModelAttribute("volunteerHabitsInfo") VolunteerHabitsInfo volunteerHabitsInfo) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerHabitsInfoService.addVolunteerHabitsInfo(volunteerHabitsInfo);
        modelAndView.setViewName("redirect:/registrationVolunteerPage3");
        return modelAndView;
    }

    @RequestMapping(value = "/registrationVolunteerPage3", method = RequestMethod.GET)
    public ModelAndView registerPageVolunteerPrimaryHealthInfo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteerPrimaryHealthInfo");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteerPage3submit")
    public ModelAndView registerVolunteerPrimaryHealthInfo(@ModelAttribute("volunteerPrimaryHealthInfo") VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerPrimaryHealthInfoService.addVolunteerPrimaryHealthInfo(volunteerPrimaryHealthInfo);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @GetMapping(value = "/contacts")
    public ModelAndView contactInformationGeneral() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contactInformationGeneral");
        return modelAndView;
    }

   @RequestMapping(value = "/medicine",method = RequestMethod.GET)
    public ModelAndView allMedicinePage(@RequestParam(defaultValue = "1") int page) {
        List<Medicine> medicines = medicineService.allMedicines();
        int medicineCount = medicineService.medicineCount();
        int pagesCount = (medicineCount + 9) / 10;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("medicineAll");
        modelAndView.addObject("medicines", medicines);
        modelAndView.addObject("medicineCount", medicineCount);
        modelAndView.addObject("pagesCount", pagesCount);
        this.page = page;
        return modelAndView;
    }

    @GetMapping(value = "/medicine/add")
    public ModelAndView registrationMedicinePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationMedicine");
        return modelAndView;
    }

    @PostMapping(value = "/medicine/add")
    public ModelAndView registrationMedicine(@ModelAttribute("medicine") Medicine medicine) {
        ModelAndView modelAndView = new ModelAndView();
        medicineService.add(medicine);
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("volunteer", new Volunteer());
        model.addAttribute("volunteerHabitsInfo", new VolunteerHabitsInfo());
        model.addAttribute("volunteerPrimaryHealthInfo", new VolunteerPrimaryHealthInfo());
        model.addAttribute("medicine", new Medicine());
    }
}
