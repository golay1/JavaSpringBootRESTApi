package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringRestValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringRestValidationApplication.class, args);
	}

}
/*
Path Variable validation
check postman with http://localhost:8765/infybank/customers/0
	should be invalid cust id (must be 1-100
	
validation in api file
for customized error message: must add to utility/ExceptionControllerAdvice.java
	otherwise, ConstraintViolationException will be thrown (500)
*/
