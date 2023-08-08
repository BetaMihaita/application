package com.example.demo.init.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private  String name;
    private  String description;
    @ManyToMany(mappedBy = "userGroups")
    private List<User> userList= new ArrayList<>();


    public UserGroup() {
    }

    public UserGroup(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public void addUser(User user){
        userList.add(user);
    }
}
