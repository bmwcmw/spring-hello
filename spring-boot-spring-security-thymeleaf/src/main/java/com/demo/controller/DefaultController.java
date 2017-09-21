package com.demo.controller;

import com.demo.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DefaultController {
    /**
     * com.demo.config.SpringSecurityConfig#inMemoryUserDetailsManager(
     * org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
     */
    @Autowired
    UserDetailsManager userDetailsManager;

    @GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new DemoUser());
        return "/registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid @ModelAttribute("user") DemoUser user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        // this.userDetailsManager is created as new bean and doesn't contains created user(SpringSecurityConfig) ??
        // should use JDBC / JdbcUserDetailsManager instead ??

//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority("USER"));
//        UserDetails userDetails = new DemoUser(user.getUsername(), user.getPassword(), authorities);

        // BindingResult already deals this with @Valid annotation
//        if (userExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the email provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("registration");
//        } else {
//            userService.saveUser(user);
//            modelAndView.addObject("successMessage", "User has been registered successfully");
//            modelAndView.addObject("user", new DemoUser());
//            modelAndView.setViewName("registration");
//        }
        return modelAndView;
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

    @GetMapping("/500")
    public String error500() {
        return "/error/500";
    }

}
