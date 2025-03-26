package de.awacademy.linkz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserDTO register(String username, String clearPassword, boolean admin) {
        String encodedPassword = passwordEncoder.encode(clearPassword);
        User user = new User(username, encodedPassword);
        user.setAdmin(admin);
        User savedUser = userRepository.save(user);

        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(savedUser.getUsername());
        userDTO.setEncodedPassword(savedUser.getPassword());

        return userDTO;
    }

    public boolean userExistent(String username) {
        return userRepository.findByUsernameIgnoreCase(username) != null;
    }

    public boolean usernameExists(String username) {
/*      User user = userRepository.findByUsernameIgnoreCase(username);
        boolean existent = user != null;

        return existent;*/
        return userRepository.existsByUsernameIgnoreCase(username);
    }

    public boolean register(String username, String password) {
        if (usernameExists(username)) {
            return false;
        }

        register(username, password, false);
        return true;
    }
}