package com.lopesdev.userdept.repositories;

import com.lopesdev.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
    