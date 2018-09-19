package cloud.hello.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
	public static void main(String[] args)
	{
		// args: --spring.profiles.active=<hostname>
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
