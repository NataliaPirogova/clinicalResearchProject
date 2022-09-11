package by.pirogova.controller;
//
//import by.pirogova.aop.GeneralControllerGetMapping;
//import by.pirogova.model.HealthcareOrganization;
import by.pirogova.model.Volunteer;
import by.pirogova.model.VolunteerHabitsInfo;
import by.pirogova.service.OrganizationService;
import by.pirogova.service.VolunteerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController {

    private static Logger logger = LoggerFactory.getLogger(OrganizationController.class);
    private final OrganizationService organizationService;
    private final VolunteerService volunteerService;

    @Autowired
    public OrganizationController(OrganizationService organizationService, VolunteerService volunteerService) {
        this.organizationService = organizationService;
        this.volunteerService = volunteerService;
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
    public ModelAndView registerPageVolunteerHabits(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteerHabitsInfo");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteerPage2submit")
    public ModelAndView registerVolunteerHabits(@ModelAttribute("volunteerHabitsInfo")VolunteerHabitsInfo volunteerHabitsInfo){
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("registrationVoluteerHabitsInfo");
        return modelAndView;
    }

    @GetMapping(value = "/contacts")
    public ModelAndView contactInformationGeneral(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contactInformationGeneral");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("volunteer", new Volunteer());
    }
}
