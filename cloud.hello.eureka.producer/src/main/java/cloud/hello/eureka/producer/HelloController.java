package cloud.hello.eureka.producer;

import java.util.Date;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController
{

	@GetMapping("/")
	public String hello(@RequestParam String name)
	{
		return "Hello, " + name + "!\n " + new Date();
	}

}