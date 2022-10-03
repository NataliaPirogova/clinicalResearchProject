package by.pirogova.controller;
//
//import by.pirogova.aop.GeneralControllerGetMapping;
//import by.pirogova.model.HealthcareOrganization;

import by.pirogova.model.Volunteer;
import by.pirogova.service.interfaces.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController {

    private static Logger logger = LoggerFactory.getLogger(OrganizationController.class);
    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping(value = "/")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/healthcareorganizations", method = RequestMethod.GET)
    public ModelAndView allOrganizations() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("healthcareorganizations");
        return modelAndView;
    }

    @GetMapping(value = "/contacts")
    public ModelAndView contactInformationGeneral() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contactInformationGeneral");
        return modelAndView;
    }
}
