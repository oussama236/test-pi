package com.gladiators.pi_spring.Services.Interfaces;

import com.gladiators.pi_spring.Entities.User;

import java.util.List;

public interface UserInterface {


   public User AddUser(User user);
   public String deleteUserById(long id);

    public User updateUser(User user);

    List<User> retrieveAllUser();

}
