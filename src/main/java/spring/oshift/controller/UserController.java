/**
 * 
 */
package spring.oshift.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.oshift.model.User;

/**
 * @author Ranjan Dutta
 *
 */
@RestController
public class UserController {

	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getAllInfo() {

		User u = new User("Ranjan ", " Dutta ", "Scarborough");
		return u;
	}

}
