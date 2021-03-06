package com.example.springsecurity.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class MyUserDetails implements UserDetails {
    private String userName;
   /* private String password;
    private List<String> role;
    private boolean isActive;*/

    public MyUserDetails(String userName) {
        this.userName = userName;

    }
  /*  public MyUserDetails(Model_User model_user) {
        this.userName = model_user.getUserName();
        this.isActive=model_user.isActive();
        this.password=model_user.getPassword();

    }*/

    public MyUserDetails() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return  Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
        return  Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));

    }

    @Override
    public String getPassword() {
        return "12345";
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
