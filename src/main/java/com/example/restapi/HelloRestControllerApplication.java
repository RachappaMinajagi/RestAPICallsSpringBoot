package com.example.restapi;
/**
 * import class for spring Boot
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @SpringBootApplication
 * Annotation Type SpringBootApplication.
 * Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning .
 */
@SpringBootApplication
/**
 * Create a class HelloRestControllerApplication
 */
public class HelloRestControllerApplication {
	/**
	 * Its executed by main method
	 * @param args no arugument to pass
	 */

	public static void main(String[] args) {
		SpringApplication.run(HelloRestControllerApplication.class, args);
	}

}
