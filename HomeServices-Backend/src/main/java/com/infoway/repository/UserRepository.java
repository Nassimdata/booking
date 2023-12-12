package com.infoway.repository;

import com.infoway.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {
    public List<User> findByEmail(String email);

    public List<User> findByEmailAndPassword(String email, String password);
}
