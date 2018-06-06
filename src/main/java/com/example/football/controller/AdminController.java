package com.example.football.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.football.dto.UserDTO;
import com.example.football.exceptions.DuplicateExistingUserException;
import com.example.football.service.UserService;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@Getter
@Setter
@Slf4j
@SessionAttributes("user")
public class AdminController {

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("admin/addUser")
    public String addUser(@ModelAttribute("user") UserDTO userDTO) {

        try {
            userService.saveUser(userDTO);
        } catch (IllegalArgumentException e) {
            log.error("An Error has occurred: {}", e.getMessage());
            return "addUser";
        } catch (DuplicateExistingUserException e) {
            log.error("A user with username {} already exists. Please try an new name {}",
                    userDTO.getUsername());
            return "addUser";
        }

        return "admin";

    }

}
