package br.jvprojetos17.userapi.service.ipml;

import br.jvprojetos17.userapi.domain.User;
import br.jvprojetos17.userapi.exception.ResourceNotFoundException;
import br.jvprojetos17.userapi.repository.UserRepository;
import br.jvprojetos17.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found for id: " + id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
