package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,String /*Primary Key*/> {

    Optional<User> findByEmail(String email);

    Optional<User> findByToken(String token);

    boolean existsByEmail(String email);


}
