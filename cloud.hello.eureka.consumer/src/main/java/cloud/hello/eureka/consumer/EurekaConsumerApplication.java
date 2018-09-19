package cloud.hello.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class EurekaConsumerApplication
{

	// Not for Feign:
//	@Bean
//	@LoadBalanced	// For Ribbon
//	public RestTemplate restTemplate()
//	{
//		return new RestTemplate();
//	}


	public static void main(String[] args)
	{
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}