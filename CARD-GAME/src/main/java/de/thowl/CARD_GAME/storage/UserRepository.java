package de.thowl.CARD_GAME.storage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.thowl.CARD_GAME.storage.entities.User;

@Repository
public interface  UserRepository extends CrudRepository<User, Long>
{
    public User findByUsername(String username);

    public User findByEmail(String email);

}
