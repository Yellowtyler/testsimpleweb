package com.example.simpleweb.repos;
import com.example.simpleweb.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;





@Component
public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByName(String name);
}