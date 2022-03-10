package com.example.springsecurity;

import com.example.springsecurity.model.Model_User;
import com.example.springsecurity.model.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    Repository_User repository_user;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       /* System.out.println(repository_user.findByUserName(username));
        Model_User model_user=repository_user.findByUserName(username);
        return new MyUserDetails(model_user);*/
        return new MyUserDetails(username);
    }
}
