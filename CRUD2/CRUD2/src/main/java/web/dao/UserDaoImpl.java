package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private static int USER_ID;

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> index() {

        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User show(int id) {

        return em.find(User.class, id);
    }

    @Override
    public void save(User user) {
        em.persist(user);
        em.close();
    }

    @Override
    public void update(int id, User updateUser) {
        em.merge(updateUser);
    }

    @Override
    public void delete(int id) throws NullPointerException {
        User user = em.find(User.class, id);
        ;
        if (null == user) {
            throw new NullPointerException("User not found");
        }
        em.remove(user);
        em.flush();
    }
}
