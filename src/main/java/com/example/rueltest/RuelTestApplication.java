package com.example.rueltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RuelTestApplication {




	public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(RuelTestApplication.class, args);

		RuleEvaluator bean = run.getBean(RuleEvaluator.class);
		bean.doTest();

	}
}
