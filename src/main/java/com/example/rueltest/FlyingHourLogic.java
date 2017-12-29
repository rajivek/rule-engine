package com.example.rueltest;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("FLYING_HOUR_LOGIC")
public class FlyingHourLogic  implements Logic{

    @Override
    public long calculate() {
        return 90;
    }
}
