package com.codegym.controller;

import com.codegym.model.Nations;
import com.codegym.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class NationsController {
    @Autowired
    private NationService nationService;

    @GetMapping("/nation/show")
    public ModelAndView companyShow() {
        Iterable<Nations> nations = nationService.showAll();
        ModelAndView modelAndView = new ModelAndView("/Nation/index_Nation");
        modelAndView.addObject("nation", nations);
        return modelAndView;
    }

    @GetMapping("/nation/create")
    public ModelAndView createCompany() {
        ModelAndView modelAndView = new ModelAndView("/Nation/create_Nation");
        modelAndView.addObject("nation", new Nations());
        return modelAndView;
    }

    @PostMapping("/nation/createfunction")
    public ModelAndView createFunction(@ModelAttribute Nations nation) {
        nationService.save(nation);
        ModelAndView modelAndView = new ModelAndView("/Nation/create_Nation");
        modelAndView.addObject("nation", new Nations());
        modelAndView.addObject("mess", "them thanh cong....!!!!");
        return modelAndView;
    }

    @GetMapping("/nation/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        Nations nation = nationService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/Nation/edit_Nation");
        modelAndView.addObject("nation", nation);
        return modelAndView;
    }

    @PostMapping("/nation/editfunction")
    public ModelAndView editConpanyFunction(@ModelAttribute Nations nation) {
        nationService.save(nation);
        ModelAndView modelAndView = new ModelAndView("redirect:/nation/show");
        modelAndView.addObject("nation", nation);
        return modelAndView;
    }
    @GetMapping("/nation/delete/{id}")
    public ModelAndView showDelete(@PathVariable Long id){
        Nations nations = nationService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/Nation/delete_Nation");
        modelAndView.addObject("nation",nations);
        return modelAndView;
    }
    @PostMapping("/nation/deletefunction")
    public ModelAndView deleteFunction(@ModelAttribute Nations nation){
        nationService.drop(nation.getIdNation());
        ModelAndView modelAndView = new ModelAndView("redirect:/nation/show");
        return modelAndView;
    }
}
