package com.example.springsecurity;

import com.example.springsecurity.model.Model_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_User extends JpaRepository<Model_User,Integer> {
    <Optional>Model_User findByUserName(String userName);
}
