package de.thowl.Anmeldung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AnmeldungImpl implements Anmeldung {


	@Autowired
	private UserRepository users;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean validateEmail(String email) {

		String regex;
		boolean result;

		log.debug("entering validateEmail");

		if (null == email)
			return false;

		// Source https://ihateregex.io/expr/email/
		regex = "[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+";

		result = email.matches(regex);

		log.debug("validateEmail(email: {}) returned: {}", email, result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean validatePassword(String password) {

		String regex;
		boolean result;

		log.debug("entering validatePassword");

		if (null == password)
			return false;

		// Source = "https://ihateregex.io/expr/password/"
		regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";

		result = password.matches(regex);

		log.debug("validatePassword(password: {}) returned: {}", password, result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws DuplicateUserException
	 */
	@Override
	public void register(String firstname, String lastname, String username,
			String email, String password) {

		User usr;

		log.debug("entering register");

		usr = new User(firstname, lastname, username, email, password);

		log.info("registering user {} with {}", username, email);
		this.users.save(usr);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void updateUser(long id, String firstname, String lastname, String username,
			String email, String password) {

		User user;

		log.debug("entering updateUser");

		user = users.findById(id).get();

		// update the user object in database
		user.setUsername(username);
		user.setEmail(email);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPassword(password);

		this.users.save(user);
		log.info("udated userdata of user id: {}", id);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String login(String email, String password) {

		User user;

		log.debug("entering login");

		user = this.users.findByEmail(email);

		log.info("login attempt for user with email: {}", email);

		if (password.equals(user.getPassword())) {
			log.info("Password matched, creating user session");
			//return Tokenizer.generateToken(user);
        }


        return "hello";
	}

}