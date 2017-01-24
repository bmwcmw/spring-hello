package org.boot;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller1 {

    @RequestMapping("/gt1")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
