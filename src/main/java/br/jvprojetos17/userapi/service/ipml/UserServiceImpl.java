package br.jvprojetos17.userapi.service.ipml;

import br.jvprojetos17.userapi.domain.User;
import br.jvprojetos17.userapi.exception.ResourceNotFoundException;
import br.jvprojetos17.userapi.repository.UserRepository;
import br.jvprojetos17.userapi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final Environment env;
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port"));
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found for id: " + id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
