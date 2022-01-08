package com.attacmosian.thymeleaf.forms.controllers;

import com.attacmosian.thymeleaf.forms.domains.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/create-project")
    public String createProjectForm(Model model) {

        model.addAttribute("project", new Project());
        return "create-project";
    }

    @PostMapping("/save-project")
    public String saveProjectSubmission(@ModelAttribute Project project) {

        // TODO: save project in DB here

        return "result";
    }
}
