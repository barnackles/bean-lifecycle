package com.kodilla.lifecycle.service;

import com.kodilla.lifecycle.BeanCalledFromController;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BeanCreationService {

    @Bean()
//    @Scope("prototype")
    public BeanCalledFromController beanCalledFromController() {
        return new BeanCalledFromController();
    }

}
