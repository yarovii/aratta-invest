package eu.cz.yarovii.arrattainvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrattaInvestApplication {

	/*@Bean
	public FillOrder getFillOrder(){
		return new FillOrder();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ArrattaInvestApplication.class, args);
	}

}
