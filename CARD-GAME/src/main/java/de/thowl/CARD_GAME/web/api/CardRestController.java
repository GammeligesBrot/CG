package de.thowl.CARD_GAME.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.thowl.CARD_GAME.storage.entities.Kartenstapel;

@RestController
@RequestMapping("/cards")
public class CardRestController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> heathCheck() {
		return ResponseEntity.status(HttpStatus.OK).body(null);
    	}

	@RequestMapping(value = "/deck", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getDeck() {
		Kartenstapel stapel = new Kartenstapel();
		return ResponseEntity.status(HttpStatus.OK).body(stapel.getKartenstapel());
    	}

}
