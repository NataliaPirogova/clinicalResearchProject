package by.pirogova.controller;

import by.pirogova.model.Volunteer;
import by.pirogova.model.VolunteerHabitsInfo;
import by.pirogova.model.VolunteerPrimaryHealthInfo;
import by.pirogova.service.interfaces.VolunteerHabitsInfoService;
import by.pirogova.service.interfaces.VolunteerPrimaryHealthInfoService;
import by.pirogova.service.interfaces.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VolunteerController {

    private final VolunteerService volunteerService;
    private final VolunteerHabitsInfoService volunteerHabitsInfoService;
    private final VolunteerPrimaryHealthInfoService volunteerPrimaryHealthInfoService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService,
                               VolunteerHabitsInfoService volunteerHabitsInfoService,
                               VolunteerPrimaryHealthInfoService volunteerPrimaryHealthInfoService) {
        this.volunteerService = volunteerService;
        this.volunteerHabitsInfoService = volunteerHabitsInfoService;
        this.volunteerPrimaryHealthInfoService = volunteerPrimaryHealthInfoService;
    }


    @GetMapping(value = "/registerVolunteer")
    public ModelAndView registerPageVolunteer() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteer");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteer")
    public ModelAndView registerVolunteer(@ModelAttribute("volunteer") Volunteer volunteer) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerService.addVolunteer(volunteer);
        modelAndView.setViewName("redirect:/registrationVolunteerHabitsInfo");
        return modelAndView;
    }

    @GetMapping(value = "/registrationVolunteerHabitsInfo")
    public ModelAndView registerPageVolunteerHabits() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteerHabitsInfo");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteerHabitsInfo")
    public ModelAndView registerVolunteerHabits(@ModelAttribute("volunteerHabitsInfo") VolunteerHabitsInfo volunteerHabitsInfo) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerHabitsInfoService.addVolunteerHabitsInfo(volunteerHabitsInfo);
        modelAndView.setViewName("redirect:/registrationVolunteerPrimaryHealthInfo");
        return modelAndView;
    }

    @GetMapping(value = "/registrationVolunteerPrimaryHealthInfo")
    public ModelAndView registerPageVolunteerPrimaryHealthInfo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationVolunteerPrimaryHealthInfo");
        return modelAndView;
    }

    @PostMapping(value = "/registrationVolunteerPrimaryHealthInfo")
    public ModelAndView registerVolunteerPrimaryHealthInfo(@ModelAttribute("volunteerPrimaryHealthInfo") VolunteerPrimaryHealthInfo volunteerPrimaryHealthInfo) {
        ModelAndView modelAndView = new ModelAndView();
        volunteerPrimaryHealthInfoService.addVolunteerPrimaryHealthInfo(volunteerPrimaryHealthInfo);
        modelAndView.setViewName("redirect:/registrationVolunteerHabitsInfo");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("volunteer", new Volunteer());
        model.addAttribute("volunteerHabitsInfo", new VolunteerHabitsInfo());
        model.addAttribute("volunteerPrimaryHealthInfo", new VolunteerPrimaryHealthInfo());
    }
}
