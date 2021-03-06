package cloud.hello.eureka.producer;

import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController
{
    @Value("${config.instance:0}")
    private int instance;

	@GetMapping("/")
	public String hello(@RequestParam String name)
	{
		// Use "--config.instance=<instance no> --server.port=<port>" to specify instance number and port
		return "[" + instance + "] " + "Hello, " + name + "!\n " + new Date();
	}

}