package de.thowl.CARD_GAME.core;

public interface Anmeldung {
    public boolean validateEmail(String email);
    public boolean validatePassword(String password);
    public void register(String firstname, String lastname, String username,
			String email, String password);
    public void updateUser(long id, String firstname, String lastname, String username,
			String email, String password);
    public String login(String email, String password);

}
