package ru.bereza.jpa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * @author Igor Bereza
 */
@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true, value = "tx")
public class DaoServiceImpl {

    @Autowired
    ApplicationContext context;

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        Session currentSession = this.sessionFactory.getCurrentSession();
        System.out.println("SESSION TYPE " + currentSession.getFlushMode());
        return currentSession;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, value = "tx")
    public void save(User user) {
        getSession().save(user);

    }

    public User get(long id) {
        return null;
    }

    @PostConstruct
    public void init() {


        User user = new User();
        user.setName("Super User");
        save(null);
    }
}
