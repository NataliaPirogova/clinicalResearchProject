package by.pirogova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController {

    @GetMapping(value = "/organizations")
    public ModelAndView allOrganizations() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("organizations");
        return modelAndView;
    }
}
