package com.example.football.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.football.dto.UserDTO;
import com.example.football.exceptions.DuplicateExistingUserException;

public interface UserService extends UserDetailsService {

    UserDTO getUserById(Integer id);

    UserDTO findByUserName(String username);

    List<UserDTO> listAllUsers();

    UserDTO saveUser (UserDTO userDTO) throws IllegalArgumentException, DuplicateExistingUserException;

    UserDTO updateUser (UserDTO userDTO) throws IllegalArgumentException, DuplicateExistingUserException;

    void deleteUserById(Integer id);

    long getCount();

    UserDTO createAdminUser(UserDTO adminUser);
}

