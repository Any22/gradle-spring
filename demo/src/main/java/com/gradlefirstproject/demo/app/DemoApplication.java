package com.gradlefirstproject.demo.app;
import com.gradlefirstproject.demo.model.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*************************************************************
 * go to File -> Project Structure and select azul-17 as SDK
 * go to gradle setting and set gradle avm : azul-17
 * ***********************************************************/
@ComponentScan(basePackages = {" com.gradlefirstproject.demo.controller"})

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);
		CustomerData cData =new CustomerData("ABC",45000);
		cData.printData();
		CustomerData cData1 =new CustomerData("DEf",45060);
		cData1.printData();

	}

}
