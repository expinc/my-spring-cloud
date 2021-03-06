package cloud.hello.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/hello")
@RestController
public class HelloController
{

//	@Autowired
//	private LoadBalancerClient client;	// Default load balancer

//	@Autowired
//	private RestTemplate restTemplate;	// Not for Feign
	
    @Autowired
    HelloRemote helloRemote;


    // Not for Feign:
	@GetMapping("/")
	public String hello(@RequestParam String name)
	{
		name = adjustName(name);
		
		// Request by default load balancer:
//		ServiceInstance instance = client.choose("eureka-producer");
//		String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name=" + name;
		
		// Request by Ribbon:
//		String url = "http://eureka-producer/hello/?name=" + name;
		
		// Not for Feign:
//		return restTemplate.getForObject(url, String.class);
		
		// Request by Feign
		return helloRemote.hello(name);
	}
    
    
    // For Feign
//	@GetMapping("/{name}")
//	public String hello(@PathVariable("name") String name)
//	{
//		return helloRemote.hello(adjustName(name));
//	}
	
	
	// To distinguish between calling from consumer and calling from producer
	private String adjustName(String name)
	{
		return name += " (consumer)";
	}

}