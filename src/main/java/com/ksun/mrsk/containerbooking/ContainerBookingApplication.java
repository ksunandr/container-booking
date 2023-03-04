

package com.ksun.mrsk.containerbooking;

import com.ksun.mrsk.containerbooking.service.ContainerAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ContainerBookingApplication {


	public static void main(String[] args) {
		SpringApplication.run(ContainerBookingApplication.class, args);


	}

//	@Bean
//	public ContainerAvailabilityService getContainerAvailabilityService(){
//		return new ContainerAvailabilityService("https://httpbin.org/");
//	}

}
