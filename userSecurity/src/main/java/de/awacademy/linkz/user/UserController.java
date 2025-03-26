package de.awacademy.linkz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {

    // private final UserRepository userRepository;
    // private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    @Autowired
    // public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("registration", new RegistrationDTO("", "", ""));
        return "registration";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("registration") RegistrationDTO registrationDTO,
                           BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        // String encodedPassword = passwordEncoder.encode(registrationDTO.getPassword1());

        if (!registrationDTO.getPassword1().equals(registrationDTO.getPassword2())) {
            bindingResult.addError(new FieldError("registration", "password2", "Does not match"));
        }

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        // userRepository.save(new User(registrationDTO.getUsername(), registrationDTO.getPassword1()));
        // userRepository.save(new User(registrationDTO.getUsername(), encodedPassword));

        userService.register(registrationDTO.getUsername(), registrationDTO.getPassword1(),false);

        redirectAttributes.addAttribute("registered", true);
        return "redirect:/";
    }
}
