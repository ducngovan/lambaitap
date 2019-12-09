package com.codegym.controller;


import com.codegym.model.Citys;
import com.codegym.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CitysController {
    @Autowired
    private CityService cityService;

    @GetMapping("/citys/show")

    public ModelAndView showKOB(@PageableDefault(size = 5) Pageable pageable) {
        Page<Citys> citys = cityService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/City/indexCity");
        modelAndView.addObject("citys", citys);
        return modelAndView;
    }


    @GetMapping("/citys/createcity")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("/City/createCity");
        modelAndView.addObject("city", new Citys());
        return modelAndView;
    }

    @PostMapping("/citys/createcity")
    public ModelAndView createKOBFunction(@ModelAttribute Citys citys) {
        cityService.save(citys);
        ModelAndView modelAndView = new ModelAndView("/City/createCity");
        modelAndView.addObject("city", new Citys());
        modelAndView.addObject("mess", "them thanh cong");
        return modelAndView;
    }


    @GetMapping("/city/updatecity/{id}")
    public ModelAndView editLB(@PathVariable Long id) {
        Citys citys = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/City/editCity");
        modelAndView.addObject("city", citys);
        return modelAndView;
    }

    @PostMapping("/city/editfunction")
    public ModelAndView editConpanyFunction(@ModelAttribute Citys city) {
        cityService.save(city);
        ModelAndView modelAndView = new ModelAndView("redirect:/citys/show");
        modelAndView.addObject("city", city);
        return modelAndView;
    }

    @GetMapping("/city/dropcity/{id}")
    public ModelAndView deleteLB(@PathVariable Long id) {
        Citys citys = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/City/deleteCity");
        modelAndView.addObject("city", citys);
        return modelAndView;
    }

    @PostMapping("/city/deletefunction")
    public ModelAndView deleteFunction(@ModelAttribute Citys citys) {
        cityService.drop(citys.getIdCity());
        ModelAndView modelAndView = new ModelAndView("redirect:/citys/show");
        return modelAndView;
    }
}
