package com.example.rueltest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RuleFactory {


    @Autowired
    ApplicationContext applicationContext;


    public Rule getRule(String action) {

        Logic bean = (Logic) applicationContext.getBean(action);

        Rule rule = applicationContext.getBean(Rule.class);
        rule.setLogic(bean);


        return rule;


    }

}
