package by.pirogova.controller;

import by.pirogova.model.HealthcareOrganization;
import by.pirogova.service.OrganizationService;
import by.pirogova.service.OrganizationServiceImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrganizationController {

    private final OrganizationService organizationService = new OrganizationServiceImplementation();

    @GetMapping(value = "/")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @GetMapping(value = "/healthcareorganizations")
    public ModelAndView allOrganizations() {
        ModelAndView modelAndView = new ModelAndView();
        List<HealthcareOrganization> organizationList = organizationService.allHealthcareOrganizations();
        modelAndView.addObject("organizations", organizationList);
        modelAndView.setViewName("healthcareorganizations");
        return modelAndView;
    }

    @GetMapping(value = "/registerVolunteer")
    public ModelAndView registerPageVolunteer() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteer");
        return modelAndView;
    }

    @PostMapping(value = "/main")
    public ModelAndView registeredVolunteer() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
}
