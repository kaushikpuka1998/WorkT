package com.kgstrivers.WorkT;

import com.kgstrivers.WorkT.Controllers.MyController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkTApplication {

	public static void main(String[] args) {
//		ApplicationContext context = ;

		MyController myController = (MyController) SpringApplication.run(WorkTApplication.class, args).getBean("myController");
		String greeting = myController.saynew();
		System.out.println("HEllo World");

		System.out.println(greeting+"YYYY");
	}

}
