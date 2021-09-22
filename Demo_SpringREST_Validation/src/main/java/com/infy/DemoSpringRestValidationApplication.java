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
Bean validation API
validation in the DTO(bean)
add messages to resources/ValidationMessages.properties
must add @valid in API post/put mapping

must add to pom.xml dependency:
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

examples:
    @NotNull(message = "Name cannot be null")
    private String name;

    @AssertTrue
    private boolean working;

    @Size(min = 10, max = 200, message 
      = "About Me must be between 10 and 200 characters")
    private String aboutMe;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email shou
*/