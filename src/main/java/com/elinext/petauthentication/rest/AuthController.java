package com.elinext.petauthentication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class AuthController {

    @GetMapping("/test")
    public String testMethod() {
        return "Succsess";
    }

}
