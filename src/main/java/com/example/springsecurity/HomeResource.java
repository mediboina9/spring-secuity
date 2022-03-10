package com.example.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
public class HomeResource {
    @PermitAll
    @GetMapping("/")
    public String getWellcom(){
        return "<h1>This is normal secuirty with permitAll access</h1>";
    }
    @GetMapping("/prop")
    public String getProp(){
        return "<h1>This is from user role access/h1>";
    }

    @GetMapping("/admin")
    public String getadmin(){
        return "<h1>This is from admin role access</h1>";
    }
}
