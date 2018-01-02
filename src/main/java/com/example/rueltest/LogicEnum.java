package com.example.rueltest;

public enum LogicEnum {



        FLYING_HOUR_LOGIC("FLYING_HOUR_LOGIC");


        private String logicName;

        LogicEnum(String flying_hour_logic) {

        this.logicName = flying_hour_logic;

    }


    public String getLogicName() {
        return logicName;
    }
}
