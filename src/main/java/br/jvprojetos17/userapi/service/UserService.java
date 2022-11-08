package br.jvprojetos17.userapi.service;

import br.jvprojetos17.userapi.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
