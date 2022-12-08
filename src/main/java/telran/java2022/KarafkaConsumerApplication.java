package telran.java2022;

import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KarafkaConsumerApplication  {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@KafkaListener(topics = "u8kz3v22-default", groupId = "java2022")
	@Bean
	public Consumer<String> print() {
		return value->System.out.println(value);
	}
}
