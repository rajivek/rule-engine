package com.example.rueltest;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rule {

    private String name;

    private Logic logic;

    private String sample;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }









}
