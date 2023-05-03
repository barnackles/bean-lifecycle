package com.kodilla.beanlifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class LibraryManager implements BeanNameAware {

    private String beanName;
    @Override
    public void setBeanName(String name) {

        beanName = name;
        System.out.println("Name of the bean: " + name);
    }
}
