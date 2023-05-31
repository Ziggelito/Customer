package com.example.customer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//Bean som lägger till kunder varor och ordrar.
	/*@Bean
	public CommandLineRunner demo(CustomerRepository costRepo, OrdersRepository orderRepo, ItemsRepository varorRepo){
		return (args) -> {
			Customer c1 = new Customer("Lawrence", "8808081123");
			Customer c2 = new Customer("Indy", "3808081123");
			Customer c3 = new Customer("Lola", "3808081123");



			Items v1 = new Items("Skor", "700");
			Items v2 = new Items("Jacka","1700");
			Items v3 = new Items("Hatt", "300");

			Orders kund1 = new Orders( "435255", c2);
			kund1.addItems(v1);
			Orders kund2 = new Orders( "65464654", c2);
			kund2.addItems(v2);
			Orders kund3 = new Orders( "8768686", c3);
			kund3.addItems(v3);

			costRepo.save(c1);
			costRepo.save(c2);
			costRepo.save(c3);

			orderRepo.save(kund1);
			orderRepo.save(kund2);
			orderRepo.save(kund3);

			varorRepo.save(v1);
			varorRepo.save(v2);
			varorRepo.save(v3);
		};
	}*/

}
