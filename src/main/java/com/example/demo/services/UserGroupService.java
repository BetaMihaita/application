package com.example.demo.services;

import com.example.demo.init.model.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;

public class UserGroupService {
    private final UserGroupRepository userGroupRepository;
    @Autowired
    public UserGroupService(UserGroupRepository userGroupRepository) {

        this.userGroupRepository = userGroupRepository;
    }
    public void createGroup(UserGroup userGroup){

        userGroupRepository.save(userGroup);
    }
}
