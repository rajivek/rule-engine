package com.example.rueltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RuelTestApplication {




	public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(RuelTestApplication.class, args);

		TestRuleFactory bean = run.getBean(TestRuleFactory.class);
		bean.doTest();

	}
}
