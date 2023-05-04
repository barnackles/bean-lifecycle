package com.kodilla.lifecycle.controller;

import com.kodilla.lifecycle.service.BeanCreationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanCreationController {

    private final BeanCreationService beanCreationService;

    public BeanCreationController(BeanCreationService beanCreationService) {
        this.beanCreationService = beanCreationService;
    }

    @RequestMapping("/create")

    public String create() {
        beanCreationService.beanCalledFromController();
        return "check logs.";
    }






}

