package com.example.rueltest;

import com.example.dto.UserRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;

@Component
public class RuleEvaluator {


    private List<UserRule> userRules = new ArrayList<>();

    private List<Rule> rules = new ArrayList<>();

    @Autowired
    RuleFactory ruleFactory;


    public void doTest(){

        //create userRules;
        createTestUserRules();


        //load rules
        loadRules();


        RuleEvaluateRequest ruleEvaluateRequest = new RuleEvaluateRequest();


        rules.forEach(r -> {
            try {
                System.out.println(r.getName() + ": " + r.evaluate(ruleEvaluateRequest));
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        });
    }

    private void loadRules() {

        userRules.forEach(u ->{

            Rule rule = ruleFactory.getRule(u.getLogic());
            rule.setName(u.getName());
            rule.setAcceptedValue((Integer) u.getAcceptedValue());
            rule.setEquation(u.getEquation());
            rule.setRuleActiveEndDateTime(u.getRuleFrom());
            rule.setRuleActiveEndDateTime(u.getRuleTo());

            rules.add(rule);

        });



    }

    private void createTestUserRules() {

        //Rule One
        UserRule userRule_1 = new UserRule();
        userRule_1.setName("90_flyingHours_in_28_days");
        userRule_1.setRange(28);
        userRule_1.setRangeTimeGranularity(TimeGranularity.DAY);
        userRule_1.setAcceptedValue(90);
        userRule_1.setEquation("XX <= 90");
        userRule_1.setLogic("FLYING_HOUR_LOGIC");
        userRule_1.setRuleFrom(1483228800000l);
        userRule_1.setRuleTo(1514764800000l);

        userRules.add(userRule_1);

        //Rule Two

        UserRule userRule_2 = new UserRule();
        userRule_2.setName("150_dutyHours_in_28_days");
        userRule_2.setRange(28);
        userRule_2.setRangeTimeGranularity(TimeGranularity.DAY);
        userRule_2.setAcceptedValue(150);
        userRule_2.setEquation("XX <= 150");
        userRule_2.setLogic("DUTY_HOUR_LOGIC");
        userRule_2.setRuleFrom(1483228800000l);
        userRule_2.setRuleTo(1514764800000l);

        userRules.add(userRule_2);
    }
}
