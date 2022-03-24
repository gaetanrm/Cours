package fr.romero.tp3.Controllers;

import fr.romero.tp3.Models.User;
import fr.romero.tp3.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping({"/", "/index"})
    public String home() { return "index"; }

    @GetMapping({"/login"})
    public String login() {	return "login"; }

    @GetMapping({"/changeUser"})
    public String changeUser() { return "changeUser"; }

    @GetMapping({"/listUsers"})
    public String listUsers() { return "listUsers"; }

    @PostMapping("doRegister")
    public String register(@Valid @ModelAttribute("user")
                                   User user, BindingResult result) {
        // check for errors ...
        // verify that username does not exist:
        if(userRepository.existsUserByUsername(user.getUsername())) {
            return "register.jsp?user=true";
        }
        else {	// encrypt password:
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            // save user object:
            userRepository.saveAndFlush(user);
            // create/save an Authority obj ...
            return "login";
        }
    }
}
