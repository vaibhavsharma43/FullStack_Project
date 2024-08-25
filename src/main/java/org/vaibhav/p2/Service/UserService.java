package org.vaibhav.p2.Service;

import org.springframework.stereotype.Service;
import org.vaibhav.p2.Entity.User;

import java.util.List;

@Service
public interface UserService {
    boolean createUser(User user);
    List<User> getAllUser();

}
