package com.JPA.JPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			Person p = new Person();
			Person p2 = new Person();
			p.setNom("Mbarki");
			p.setPrenom("Sofiane");
			p2.setNom("Mbarki");
			p2.setPrenom("Mohammed");
			Rent rent = new Rent();
			Rent rent2 = new Rent();
			p.getRents().add(rent);
			p2.getRents().add(rent2);
			rent.setPerson(p);
			rent2.setPerson(p2);
			rent.setBeginRent("2021-10-02");
			rent.setEndRent("2021-10-05");
			rent2.setBeginRent("2021-10-02");
			rent2.setEndRent("2021-10-05");
			Car car = new Car("AB-123-CD", "Aimen" ,5);
			Car car2 = new Car("AB-124-CD", "Volvo" ,5);
			car.getRents().add(rent);
			car2.getRents().add(rent2);
			rent.setVehicule(car);
			rent2.setVehicule(car2);
			repository.save(p);
			repository.save(p2);



		};
	}
}
