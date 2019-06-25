package user;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	// GET/users
	// retreiveAllUSERS

	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers() {
		List<User> users = service.findAll();
		System.out.println(users.size());
		return users;

	}

	// GET/users/id
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = service.finDone(id);
				if(user==null) 
					throw new UserNotFoundException("id-"+id);
					
					return user;
				}
	

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		//created
		//user/4 url 
		//give back the status code
		URI location=ServletUriComponentsBuilder
				.fromCurrentRequestUri()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();

	}
	
}
