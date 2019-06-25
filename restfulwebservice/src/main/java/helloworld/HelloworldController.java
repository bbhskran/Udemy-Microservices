package helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloworldController {
 // GET
// URI-/helloworld
//method -"helloworld"
	//hello-world-bean creat a bean a nd return bag
 @GetMapping(path="/hello-World")
	public String helloworld() {
		return "hello world";
	}
 //
	@GetMapping(path="/hello-World-bean")
	public HelloWorldBean helloworldbean() {
		return new HelloWorldBean("hello world");
	}
	///hello-World/path-variable/in28minutes
	@GetMapping(path="/hello-World/path-variable/{name}")
	public HelloWorldBean helloworlPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello world, %s",name));
	}
}
