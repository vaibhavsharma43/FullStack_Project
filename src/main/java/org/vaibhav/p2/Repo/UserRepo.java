package org.vaibhav.p2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaibhav.p2.Entity.User;
@Repository
public interface UserRepo  extends JpaRepository<User,Integer> {
}
