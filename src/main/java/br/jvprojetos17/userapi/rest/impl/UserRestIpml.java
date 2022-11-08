package br.jvprojetos17.userapi.rest.impl;

import br.jvprojetos17.userapi.domain.User;
import br.jvprojetos17.userapi.rest.UserRest;
import br.jvprojetos17.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserRestIpml implements UserRest {
    
    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
