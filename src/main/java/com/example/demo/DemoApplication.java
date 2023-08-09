package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		DemoApplication application=new DemoApplication();
		application.initdata();

	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s te iubesc!", name);
	}

	public void initdata(){


	}


}







