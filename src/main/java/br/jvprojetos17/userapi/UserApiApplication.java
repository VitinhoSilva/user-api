package br.jvprojetos17.userapi;

import br.jvprojetos17.userapi.domain.User;
import br.jvprojetos17.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userRepository.saveAll(
            List.of(
                    new User(null, "José Vitor", "josev4854@gmail.com", "J@aagsas", 37.67),
                    new User(null, "Max Silva", "max187@gmail.com", "J@asasas", 25.54)
            ));
    }
}
