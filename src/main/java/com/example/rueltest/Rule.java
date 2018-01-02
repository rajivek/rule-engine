package com.example.rueltest;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Rule {

    private String equationMaker = "XX";

    private String name;

    private TimeGranularity timeGranularity;

    private Logic logic;

    private String equation;

    private double acceptedValue;

    private  long ruleActiveStartDateTime;

    private  long ruleActiveEndDateTime;

    public double getAcceptedValue() {
        return acceptedValue;
    }

    public void setAcceptedValue(double acceptedValue) {
        this.acceptedValue = acceptedValue;
    }

    private List<Rule> rules = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }


    public TimeGranularity getTimeGranularity() {
        return timeGranularity;
    }

    public void setTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    public Logic getLogic() {
        return logic;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public long getRuleActiveStartDateTime() {
        return ruleActiveStartDateTime;
    }

    public void setRuleActiveStartDateTime(long ruleActiveStartDateTime) {
        this.ruleActiveStartDateTime = ruleActiveStartDateTime;
    }

    public long getRuleActiveEndDateTime() {
        return ruleActiveEndDateTime;
    }

    public void setRuleActiveEndDateTime(long ruleActiveEndDateTime) {
        this.ruleActiveEndDateTime = ruleActiveEndDateTime;
    }

    public boolean evaluate(RuleEvaluateRequest ruleEvaluateRequest) throws ScriptException {

        /*1. check rule effective with activity
        * 2. create range with time granularity
        * 3. */

        //


        long calculate = logic.calculate();

        String processEquation = equation.replace(equationMaker, String.valueOf(calculate));

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine javaScript = engineManager.getEngineByName("JavaScript");

       // Boolean eval = graterThanAction.execute(calculate, acceptedValue);

        Boolean eval = (Boolean) javaScript.eval(processEquation);

        return eval;

    }






}
