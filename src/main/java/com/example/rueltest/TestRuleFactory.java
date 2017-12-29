package com.example.rueltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestRuleFactory {


    private List<Rule> rules = new ArrayList<>();

    @Autowired
    RuleFactory ruleFactory;


    public void doTest(){


        Rule ruleOne = ruleFactory.getRule("DUTY_HOUR_LOGIC");


        rules.add(ruleOne);


        Rule ruleTwo = ruleFactory.getRule("FLYING_HOUR_LOGIC");



        boolean equals = ruleOne.equals(ruleTwo);
        System.out.println(equals);

        rules.add(ruleTwo);


        rules.forEach(r -> System.out.println(r.getName() + ": " + r.getLogic().calculate()));
    }
}
