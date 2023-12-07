package org.perscholas.sprintboot.service;

import org.perscholas.sprintboot.database.dao.UserDAO;
import org.perscholas.sprintboot.database.entity.User;
import org.perscholas.sprintboot.formbean.RegisterUserFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Service
public class AuthService {
    @Autowired
    private UserDAO userDao;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createNewUser(RegisterUserFormBean form){
        User user = new User();

        String encoded = passwordEncoder.encode(form.getPassword());
        log.debug("Encoded password: "+encoded);
        user.setEmail(form.getEmail());
        user.setPassword(encoded);


        return userDao.save(user);
    }
}
