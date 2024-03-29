package com.bandall.location_share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class}) //remove default password
public class LocationShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationShareApplication.class, args);
	}

}
