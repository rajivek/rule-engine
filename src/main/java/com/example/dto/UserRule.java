package com.example.dto;

import com.example.rueltest.TimeGranularity;

public class UserRule {

    private String equation;
    private String logic;
    private TimeGranularity timeGranularity;
    private int range;
    private TimeGranularity rangeTimeGranularity;
    private String name;
    private long ruleFrom;
    private long ruleTo;
    private Object acceptedValue;

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public TimeGranularity getTimeGranularity() {
        return timeGranularity;
    }

    public void setTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRuleFrom() {
        return ruleFrom;
    }

    public void setRuleFrom(long ruleFrom) {
        this.ruleFrom = ruleFrom;
    }

    public long getRuleTo() {
        return ruleTo;
    }

    public void setRuleTo(long ruleTo) {
        this.ruleTo = ruleTo;
    }

    public Object getAcceptedValue() {
        return acceptedValue;
    }

    public void setAcceptedValue(Object acceptedValue) {
        this.acceptedValue = acceptedValue;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public TimeGranularity getRangeTimeGranularity() {
        return rangeTimeGranularity;
    }

    public void setRangeTimeGranularity(TimeGranularity rangeTimeGranularity) {
        this.rangeTimeGranularity = rangeTimeGranularity;
    }
}
