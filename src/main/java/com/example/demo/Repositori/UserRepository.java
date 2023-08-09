package com.example.demo.Repositori;

import com.example.demo.init.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
