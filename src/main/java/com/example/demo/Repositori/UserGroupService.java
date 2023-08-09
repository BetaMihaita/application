package com.example.demo.Repositori;

import com.example.demo.init.model.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
