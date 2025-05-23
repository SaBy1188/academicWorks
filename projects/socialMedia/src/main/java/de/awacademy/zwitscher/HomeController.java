package de.awacademy.zwitscher;

import de.awacademy.zwitscher.repository.MessageRepository;
import de.awacademy.zwitscher.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    private MessageRepository messageRepository;

    @Autowired
    public HomeController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/")
    public String home(@ModelAttribute("sessionUser") User sessionUser, Model model) {
        model.addAttribute("messages", messageRepository.findAllByOrderByPostedAtDesc());
        return "home";
    }

}
