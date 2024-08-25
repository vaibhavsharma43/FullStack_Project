package org.vaibhav.p2.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaibhav.p2.Entity.User;
import org.vaibhav.p2.Repo.UserRepo;
import org.vaibhav.p2.Service.UserService;

import java.util.List;
@Service
public class UserImp implements UserService {
@Autowired
      UserRepo userRepo;

    @Override
    public boolean createUser( User user) {
        userRepo.save(user);
        return true;
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
