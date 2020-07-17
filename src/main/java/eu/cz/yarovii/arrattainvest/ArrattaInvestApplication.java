package eu.cz.yarovii.arrattainvest;

import eu.cz.yarovii.arrattainvest.businessLogic.FillOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
