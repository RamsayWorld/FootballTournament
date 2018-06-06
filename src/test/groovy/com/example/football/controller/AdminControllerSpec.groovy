package com.example.football.controller

import org.springframework.http.MediaType.*

import com.example.football.dto.UserDTO
import com.example.football.service.UserService

import spock.lang.Specification

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//@AutoConfigureMockMvc(secure = false)
class AdminControllerSpec extends Specification {

    //@Autowired
    //MockMvc mockMvc

    def userService = Mock(UserService)
    def adminController = new AdminController(userService)

    def "add a new user"(){

        given:
        def user = new UserDTO("Mushy", "Lee", "Ramsay", true, "testpassword", true)

        when:

        def response = adminController.addUser(user)

        then:
        1 * userService.saveUser(_)

        response == "admin"

    }
}
