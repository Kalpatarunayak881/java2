package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj08ComplexYmlApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj08ComplexYmlApplication.class, args);
		//get Customer obj ref
		Employee empl=ctx.getBean("impl",Employee.class);
		System.out.println(empl);
		//close IOC Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
