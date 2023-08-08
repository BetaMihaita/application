package com.example.demo.services;

import com.example.demo.init.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup,Long> {
}
