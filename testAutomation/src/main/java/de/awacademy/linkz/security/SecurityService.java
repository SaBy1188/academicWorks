package de.awacademy.linkz.security;

import de.awacademy.linkz.user.User;
import de.awacademy.linkz.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService implements UserDetailsService {
    private final UserRepository userRepository;
    @Autowired
    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsernameIgnoreCase(username);
        /*
        User user = userRepository.findByUsernameIgnoreCase(username)
        .orElseThrow(() -> new UsernameNotFoundException("Not found"));         Lambda Ausdruck
        */
        if (user == null) {
            System.err.println("User '" + username + "' not found.");
            throw new UsernameNotFoundException("User '" + username + "' not found.");
        }

        /*
        return new org.springframework.security.core.userdetails.User(
        user.getUsername(), user.getPassword(), List.of()
        );
        */
        List< GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (user.isAdmin()) {
            grantedAuthorities.add(new SimpleGrantedAuthority("DELETE LINK"));
        }

        org.springframework.security.core.userdetails.User userDetails =
                new org.springframework.security.core.userdetails.User(
                        user.getUsername(), user.getPassword(), grantedAuthorities
        );

        return userDetails;
    }
}
