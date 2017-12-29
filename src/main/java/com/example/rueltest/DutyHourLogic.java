package com.example.rueltest;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DUTY_HOUR_LOGIC")
public class DutyHourLogic implements Logic {


    @Override
    public long calculate() {
        return 200;
    }
}
