package com.security.securityPractice.config;


import com.security.securityPractice.entity.Role;
import com.security.securityPractice.entity.User;
import com.security.securityPractice.enums.Gender;
import com.security.securityPractice.repo.RoleRepo;
import com.security.securityPractice.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class InitDbConfig {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @PostConstruct
    public void doEntries(){
        if(roleRepo.findAll().size() == 0){

            //Creating the admin role
            Role adminRole = new Role();
            adminRole.setName("ADMIN");
            Role savedRole = roleRepo.save(adminRole);

            //Creating a user role
            Role userRole = new Role();
            userRole.setName("USER");
            roleRepo.save(userRole);

            //Creating a user
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            User user = new User();
            user.setName("Biplaw");
            user.setUsername("beep");
            user.setPassword(encoder.encode("abc123"));
            user.setGender(Gender.MALE);

            user.setRoles(Arrays.asList(savedRole));
            userRepo.save(user);

        }

    }
}
