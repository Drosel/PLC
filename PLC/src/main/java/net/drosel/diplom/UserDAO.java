package net.drosel.diplom;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * User: Andrew
 * Date: 16.12.2015
 * Time: 10:57
 */
@Repository
public class UserDAO implements IUserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user){
        entityManager.merge(user);
    }
}
